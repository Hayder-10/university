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
public class Cinema {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
String nom ;
String adresse;
int telephone;
    @OneToMany(mappedBy = "cinema")
    Set<Salle> salles;

}
