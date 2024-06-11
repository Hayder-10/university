package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Etudiant;

import java.util.Optional;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
    @Query("SELECT e FROM Etudiant e WHERE e.cin = :cin")
    Optional<Etudiant> findByCinQuery(long cin);
}
