package tn.esprit.workshopspring.services;

import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public Foyer ajouterFoyer(     Foyer foyer );
    public Foyer ajouterFoyerEnCascadeBlocs(     Foyer foyer );
    Foyer chercherFoyerParId(long id);
    void supprimerFoyer(Foyer foyer);
    void supprimerFoyerParID(long id);
    List<Foyer> afficherTout();
    List<Foyer> ajouterFoyers(List<Foyer> foyers);
    Foyer modifierFoyer(Foyer foyer);

    Foyer modifierNomFoyer(String nom , long id);
    Foyer affecterFoyerABloc(String nomFoyer, Bloc bloc);


    Foyer ajouterFoyerEtAffecterAlUniversite(Foyer foyer, long idUniversite);
}
