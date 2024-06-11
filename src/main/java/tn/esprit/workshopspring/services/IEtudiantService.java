package tn.esprit.workshopspring.services;

import tn.esprit.workshopspring.entities.Etudiant;

import java.util.Optional;

public interface IEtudiantService {
    Optional<Etudiant> findByCin(long cin);
}
