package tn.esprit.workshopspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.workshopspring.entities.Etudiant;
import tn.esprit.workshopspring.repositories.EtudiantRepo;

import java.util.Optional;

@Service
public class EtudiantServiceImpl implements IEtudiantService{


    @Autowired
    private EtudiantRepo etudiantRepository;
    @Override
    public Optional<Etudiant> findByCin(long cin) {
        return etudiantRepository.findByCinQuery(cin);
    }

}
