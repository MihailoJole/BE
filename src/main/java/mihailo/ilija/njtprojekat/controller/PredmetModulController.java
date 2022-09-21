package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.domain.PredmetModulPK;

import mihailo.ilija.njtprojekat.dto.PredmetModulDto;
import mihailo.ilija.njtprojekat.dto.PredmetModulResponseDto;

import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import mihailo.ilija.njtprojekat.service.PredmetModulService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/predmetmodul")
@CrossOrigin("*")
public class PredmetModulController {
    PredmetModulService predmetModulService;

    public PredmetModulController(PredmetModulService predmetModulService) {
        this.predmetModulService = predmetModulService;
    }


    @GetMapping("/allByModulId/{id}")
    public List<PredmetModulResponseDto> getAllByModulId(@PathVariable("id") Integer id){
        return predmetModulService.getAllByModulId(id);
    }

    @GetMapping("/allByModulIdSortByGodinaSortByPozicija/{id}")
    public List<PredmetModulResponseDto> getAllByModulIdSortByGodinaSortByPozicija(@PathVariable("id") Integer id){
        return predmetModulService.getAllByModulIdSortByGodinaSortByPozicija(id);
    }
    @GetMapping("/all")
    public List<PredmetModulResponseDto> getAll(){
        return predmetModulService.getAll();
    }

    @DeleteMapping ("/delete")
    public ResponseEntity<Object> deleteById(@RequestBody PredmetModulPK predmetModulPK) {
        System.out.println(predmetModulPK);
        predmetModulService.deleteById(predmetModulPK);
        return ResponseEntity.status(HttpStatus.OK).body("Predmetmodul je izbrisan");

    }

    @PostMapping("/add")
    public ResponseEntity addNewPredmetModul(@RequestBody PredmetModulDto predmetModulDto){
        return ResponseEntity.status(201).body(predmetModulService.save(predmetModulDto));
    }


    @PutMapping("/update")
    public ResponseEntity updatePredmetModul(@RequestBody PredmetModulDto predmetModulDto){
        return ResponseEntity.status(201).body(predmetModulService.update(predmetModulDto));
    }

}
