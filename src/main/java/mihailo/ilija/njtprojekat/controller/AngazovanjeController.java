package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.domain.AngazovanjePK;
import mihailo.ilija.njtprojekat.dto.AngazovanjeDto;
import mihailo.ilija.njtprojekat.dto.AngazovanjeResponseDto;
import mihailo.ilija.njtprojekat.dto.PredmetModulResponseDto;
import mihailo.ilija.njtprojekat.service.AngazovanjeService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*@EnableJpaRepositories("mihailo.ilija.njtprojekat.repositories.AngazovanjeRepository")
@ComponentScan({"mihailo.ilija.njtprojekat.service"})*/
@RestController
@RequestMapping(path = "/angazovanje")
@CrossOrigin("*")
public class AngazovanjeController {
    AngazovanjeService angazovanjeService;

    public AngazovanjeController(AngazovanjeService angazovanjeService) {
        this.angazovanjeService = angazovanjeService;
    }

    @GetMapping("/allByPredmetId/{id}")
    public List<AngazovanjeResponseDto> getAllByPredmetId(@PathVariable("id") Integer id){
        return angazovanjeService.getAllByPredmetId(id);
    }
//getAngazovanjeById
    @GetMapping
    public List<AngazovanjeResponseDto> getAll(){
        return angazovanjeService.getAll();
    }

    @PostMapping("/delete")
    public ResponseEntity<Object> deleteById(@RequestBody AngazovanjePK angazovanjePK) {
        System.out.println(angazovanjePK);
        angazovanjeService.deleteById(angazovanjePK);
        return ResponseEntity.status(HttpStatus.OK).body("Angazovanje za dati predmet je izbrisano");

    }

    @PostMapping
    public ResponseEntity addNewAngazovanje(@RequestBody AngazovanjeDto angazovanjeDto){
        return ResponseEntity.status(201).body(angazovanjeService.save(angazovanjeDto));
    }

    
    @PutMapping
    public ResponseEntity updateAngazovanje(@RequestBody AngazovanjeDto angazovanjeDto){
        return ResponseEntity.status(201).body(angazovanjeService.update(angazovanjeDto));
    }

}
