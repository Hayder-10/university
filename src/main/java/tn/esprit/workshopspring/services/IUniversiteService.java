package tn.esprit.workshopspring.services;

import tn.esprit.workshopspring.entities.Foyer;
import tn.esprit.workshopspring.entities.Universite;

public interface IUniversiteService {
    public Universite affecterFoyerAUniversite(long idFoyer,String nomUniversite);
    public Universite desafecterFoyerUniversite(long idUniversite);
}
