package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Foyer;
 @Repository
public interface FoyerRepo extends JpaRepository<Foyer,Long> {
    @Query("select foyer from Foyer foyer where foyer.nomFoyer=:nom")
    Foyer chercherParNomFoyer(@Param("nom") String nomFoyer);
    Foyer findFoyerByNomFoyer(String nom );
    //Foyer findFoyerByNomFoyerAndBlocIDBloc(String nomFoyer,long idBlocB);
    //@Query("select foyer from Foyer foyer join foyer.Blocs bloc where foyer.nomFoyer=:nom and bloc.idBloc=:id")
    //Foyer chercherFoyerParNometIdBloc(@Param("nom")String nomF, @Param("id")long idBloc);



}
