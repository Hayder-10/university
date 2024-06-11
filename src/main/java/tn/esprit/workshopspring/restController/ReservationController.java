package tn.esprit.workshopspring.restController;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.workshopspring.entities.Reservation;
import tn.esprit.workshopspring.services.IReservationService;

@RestController

@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

IReservationService reservationService;


    @PostMapping("/add/{idBloc}/{cinEtudiant}")
    public Reservation ajouterReservation(
            @PathVariable long idBloc,
            @PathVariable long cinEtudiant) {
        return reservationService.ajouterReservation(idBloc, cinEtudiant);
    }
}
