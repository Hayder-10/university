package tn.esprit.workshopspring.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Foyer;
import tn.esprit.workshopspring.entities.Universite;
import tn.esprit.workshopspring.services.IUniversiteService;
import tn.esprit.workshopspring.services.UniversiteServiceImpl;
@RestController
@AllArgsConstructor
@RequestMapping("/universite-rest-controller")
public class UniversiteRestController {
    IUniversiteService universiteService;
    @PutMapping(path="/universite-foyer/{nom-universite}/{id}")
    public Universite affecterFoyerAUniversite(@PathVariable("nom-universite") String nomUniversite, @PathVariable("id") long id){
        return universiteService.affecterFoyerAUniversite(id, nomUniversite);
    }
    @PutMapping(path="/universite-foyer/{id}")
    public Universite desaffecterFoyerUniversite(@PathVariable("id") long id){
        return universiteService.desafecterFoyerUniversite(id);
    }
}
