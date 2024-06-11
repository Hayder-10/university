package tn.esprit.workshopspring.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Foyer;
import tn.esprit.workshopspring.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc-rest-controller")
public class BlocRestController {
    IBlocService blocService;
    @PutMapping("/bloc-affecterChambres/{id-bloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numsChambres, @PathVariable("id-bloc") Long idBloc){
        return blocService.affecterChambresABloc(numsChambres,idBloc);
    }
    @PostMapping("/")
    public Bloc ajouterBloc(@RequestBody Bloc bloc){
        return blocService.ajouterBlocEnCascade(bloc);
    }
    @GetMapping("/bloc/{id-bloc}")
    Bloc getBlocAndChambres(@PathVariable("id-bloc") long id){
        return blocService. getBlocById(id);
    }





}
