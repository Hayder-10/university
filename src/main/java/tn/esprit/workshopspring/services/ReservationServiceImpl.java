package tn.esprit.workshopspring.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.workshopspring.entities.*;
import tn.esprit.workshopspring.repositories.BlocRepo;
import tn.esprit.workshopspring.repositories.ChambreRepo;
import tn.esprit.workshopspring.repositories.EtudiantRepo;
import tn.esprit.workshopspring.repositories.ReservationRepo;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{


    private BlocRepo blocRepository;


    private ChambreRepo chambreRepository;

    private IEtudiantService etudiantService;

    private EtudiantRepo etudiantRepository;


    private ReservationRepo reservationRepository;


    BlocRepo blocRepo;
    ChambreRepo chambreRepo;
    ReservationRepo reservationRepo;
    String generateUniqueReservationNumber(long idChambre, long cinEtudiant){
        //numRes = numChambre+nomBloc+AnneUniversitaire
        Chambre chambre = chambreRepo.findById(idChambre).orElse(null);

        if(chambre.getTypeC() == null){}
        return null;
    }



   @Override
   public Reservation ajouterReservation(long idBloc, long cinEtudiant) {
       // Find the student
       Etudiant etudiant = etudiantService.findByCin(cinEtudiant).orElse(null);
       if (etudiant == null) {
           throw new IllegalArgumentException("Etudiant with CIN " + cinEtudiant + " not found");
       }

       // Find a room in the bloc with available capacity
       Bloc bloc = blocRepository.findById(idBloc).orElse(null);
       if (bloc == null) {
           throw new IllegalArgumentException("Bloc with ID " + idBloc + " not found");
       }

       Chambre chambre = findAvailableRoomInBloc(bloc);

       // If no room is available
       if (chambre == null) {
           throw new IllegalStateException("No available rooms in the bloc " + bloc.getNomBloc());
       }

       // Create reservation
       Reservation reservation = new Reservation();
       reservation.setNumRes(chambre.getNumeroChambre() + "-" + bloc.getNomBloc() + "-" + LocalDate.now().getYear());
       reservation.setAnneeUniversitaire(LocalDate.now());
       reservation.setEstValide(true);

       // Assign room to reservation
       chambre.getReservations().add(reservation);

       // Assign student to reservation
       etudiant.getReservations().add(reservation);

       // Save reservation
       return reservationRepository.save(reservation);
   }

    private Chambre findAvailableRoomInBloc(Bloc bloc) {
        for (Chambre chambre : bloc.getChambres()) {
            if (chambre.getReservations().isEmpty()) {
                return chambre;
            }
        }
        return null;
    }
}
