package tn.esprit.workshopspring.services;

import tn.esprit.workshopspring.entities.Reservation;

public interface IReservationService {
    Reservation ajouterReservation(long idBloc, long cinEtudiant);
}
