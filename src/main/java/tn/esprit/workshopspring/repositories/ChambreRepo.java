package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Chambre;
import tn.esprit.workshopspring.entities.Universite;
@Repository
public interface ChambreRepo extends JpaRepository<Chambre,Long> {
    @Query("select chambre FROM Chambre chambre where chambre.numeroChambre =:numChambre")
    Chambre chercherParNumChambre(@Param("numChambre") Long numeroChambre);
    @Modifying
    @Query("update Chambre chambre set chambre.bloc.idBloc =:idBloc where chambre.numeroChambre =:numChambre")
    void affecterChambreABloc(@Param("idBloc") Long idBloc,@Param("numChambre") Long numeroChambre);
}
