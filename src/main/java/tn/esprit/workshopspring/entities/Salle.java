package tn.esprit.workshopspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    int  capacite;
    @ManyToOne
    Cinema cinema;
    @ManyToMany
    Set<Film> films;

}
