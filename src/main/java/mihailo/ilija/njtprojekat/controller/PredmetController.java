package mihailo.ilija.njtprojekat.controller;


import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.service.PredmetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/predmet")
@CrossOrigin("*")
public class PredmetController {

    private PredmetService predmetService;

    public PredmetController(PredmetService predmetService) {
        this.predmetService = predmetService;
    }

    @GetMapping
    public List<PredmetDto> getAll(){
        return predmetService.getAll();
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable int id) {
            predmetService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Predmet sa id " +  id + " je izbrisan!");
    }

    @GetMapping(path = "/{id}")
    public PredmetDto getById(@PathVariable int id) { return predmetService.findById(id);}

    @PostMapping
    public ResponseEntity addNewPredmet(@RequestBody PredmetDto predmetDto){
        return ResponseEntity.status(201).body(predmetService.save(predmetDto));
    }

    @PutMapping
    public ResponseEntity updatePredmet(@RequestBody PredmetDto predmetDto){
        return ResponseEntity.status(200).body(predmetService.update(predmetDto));
    }


}
