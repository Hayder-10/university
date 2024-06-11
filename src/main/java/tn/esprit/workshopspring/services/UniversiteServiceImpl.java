package tn.esprit.workshopspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.workshopspring.entities.Foyer;
import tn.esprit.workshopspring.entities.Universite;
import tn.esprit.workshopspring.repositories.FoyerRepo;
import tn.esprit.workshopspring.repositories.UniversiteRepo;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    FoyerServiceImpl foyerService;
    UniversiteRepo universiteRepo;
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite universite = universiteRepo.chercherParNomUniversite(nomUniversite);
        Foyer foyer = foyerService.chercherFoyerParId(idFoyer);
        universite.setFoyer(foyer);
        universiteRepo.save(universite);
        return universite;
    }

    @Override
    public Universite desafecterFoyerUniversite(long idUniversite) {
        Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        if (universite != null) {
            universite.setFoyer(null);
            universiteRepo.save(universite);
        }
        return universite;
    }

}
