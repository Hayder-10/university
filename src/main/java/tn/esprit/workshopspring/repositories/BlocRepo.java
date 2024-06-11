package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Bloc;
@Repository
public interface BlocRepo extends JpaRepository<Bloc,Long> {


}
