package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Universite;
@Repository
public interface UniversiteRepo extends JpaRepository<Universite,Long> {
    @Query("select universite FROM Universite universite where universite.nomUniversite =:nom")
    Universite chercherParNomUniversite(@Param("nom") String nomUniversite);
}
