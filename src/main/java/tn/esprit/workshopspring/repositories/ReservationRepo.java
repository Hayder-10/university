package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Chambre;
import tn.esprit.workshopspring.entities.Reservation;
@Repository
public interface ReservationRepo extends JpaRepository<Reservation, String> {
//    @Query("select count(*) FROM  chamb_res  where chamb_res.numeroChambre =:numChambre")
//    Chambre chercherParNumChambre(@Param("numChambre") Long numeroChambre);
}
