package tn.esprit.workshopspring.services;

import tn.esprit.workshopspring.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc affecterChambresABloc(List<Long> numsChambres, Long idBloc);

    Bloc ajouterBlocEnCascade(Bloc bloc);
    Bloc getBlocById(Long id);
}
