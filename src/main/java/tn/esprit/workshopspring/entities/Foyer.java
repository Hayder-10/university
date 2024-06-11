package tn.esprit.workshopspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer ;
    String nomFoyer ;
    long capaciteFoyer ;
    @OneToOne(mappedBy ="foyer")
            @ToString.Exclude
            @JsonIgnore
    Universite universite;
    @OneToMany(mappedBy ="foyer", cascade = CascadeType.ALL)
            @ToString.Exclude
    Set<Bloc> Blocs=new HashSet<>();

}
