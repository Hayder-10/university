package tn.esprit.workshopspring.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Foyer;
import tn.esprit.workshopspring.services.IFoyerService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping("/foyer-rest-controller")
public class FoyerRestController {
    IFoyerService foyerService;
    @PostMapping(path ="/foyer")
    public Foyer ajouterFoyer(@RequestBody Foyer foyer ){
        return foyerService.ajouterFoyer(foyer);
    }
    @PostMapping(path ="/foyerBlocs")
    public Foyer ajouterFoyerEnCascadeBlocs(@RequestBody Foyer foyer ){
        return foyerService.ajouterFoyerEnCascadeBlocs(foyer);
    }
    @GetMapping("/foyer/{id-foyer}")
    Foyer chercherFoyerParId(@PathVariable("id-foyer") long id){
        return foyerService. chercherFoyerParId(id);
    }
    @DeleteMapping("/foyers")
    void supprimerFoyer(@RequestBody Foyer foyer){
foyerService.supprimerFoyer(foyer);
    }
@DeleteMapping("/foyer/{id-foyer}")
    void supprimerFoyerParID( @PathVariable("id-foyer") long id){
foyerService.supprimerFoyerParID(id);
    }
    @GetMapping("/foyers")
    List<Foyer> afficherTout(){
        return foyerService.afficherTout();
    }
    @PostMapping("/foyers")
    List<Foyer> ajouterFoyers( @RequestBody  List<Foyer> foyers){
        return foyerService.ajouterFoyers( foyers);
    }
    @PutMapping("/foyer")
    Foyer modifierFoyer( @RequestBody  Foyer foyer){
        return foyerService.modifierFoyer(foyer);
    }
@PutMapping("/foyer/{id-foyer}/{nom-foyer}")
    Foyer modifierNomFoyer(@PathVariable("nom-foyer") String nom , @PathVariable("id-foyer") long id){
        return foyerService.modifierNomFoyer(nom,id);
    }
    @PostMapping(path="/foyer-bloc/{nom-foyer}")
    public Foyer affecterFoyerABloc(@PathVariable("nom-foyer") String nomFoyer,@RequestBody Bloc bloc){
        return foyerService.affecterFoyerABloc(nomFoyer , bloc);
    }

    @PostMapping("/ajouter/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAlUniversite(@RequestBody Foyer foyer, @PathVariable long idUniversite) {
        return foyerService.ajouterFoyerEtAffecterAlUniversite(foyer, idUniversite);
    }

}
