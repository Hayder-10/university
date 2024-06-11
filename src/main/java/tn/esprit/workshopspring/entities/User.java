package tn.esprit.workshopspring.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUser;
    @Column(length = 8,name = "identifiant")
    String cin;
    @Transient
    String firstName;
    String lastName;
    LocalDate dateBirth;
    @Enumerated(EnumType.STRING)
    Role role ;

}
