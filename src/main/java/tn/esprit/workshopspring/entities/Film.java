package tn.esprit.workshopspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    Date dateProduction;
    @Enumerated(EnumType.STRING)
    TypeFilm type ;
}
