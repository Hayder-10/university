package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
