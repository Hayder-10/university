package tn.esprit.workshopspring.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Chambre;
import tn.esprit.workshopspring.repositories.BlocRepo;
import tn.esprit.workshopspring.repositories.ChambreRepo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{
    BlocRepo blocRepo;
    ChambreRepo chambreRepo;
    @Override
    public Bloc affecterChambresABloc(List<Long> numsChambres, Long idBloc) {
        Bloc bloc = blocRepo.findById(idBloc).orElse(null);
        if (bloc.getChambres() == null)
            bloc.setChambres(new HashSet<Chambre>());
        for (Long nCh : numsChambres){
            bloc.getChambres().add(chambreRepo.chercherParNumChambre(nCh));
            chambreRepo.affecterChambreABloc(bloc.getIdBloc(),nCh);
        }
        blocRepo.save(bloc);
        return bloc;
    }

    @Override
    public Bloc ajouterBlocEnCascade(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc getBlocById(Long id) {
        return blocRepo.findById(id).orElse(null);
    }



}
