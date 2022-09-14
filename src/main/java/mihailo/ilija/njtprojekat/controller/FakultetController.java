package mihailo.ilija.njtprojekat.controller;


import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import mihailo.ilija.njtprojekat.service.FakultetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/fakultet")
@CrossOrigin("*")
public class FakultetController {

    @Autowired
    private FakultetService fakultetService;

    public FakultetController() {
    }

    public FakultetController(FakultetService fakultetService) {
        this.fakultetService = fakultetService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Fakultet>> getAllFakultet () {
        List<Fakultet> fakulteti = fakultetService.findAllFakultet();
        return new ResponseEntity<>(fakulteti, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Fakultet> getFakultetById (@PathVariable("id") Integer id) {
        Fakultet fakultet = fakultetService.findFakultetById(id);
        return new ResponseEntity<>(fakultet, HttpStatus.OK);
    }
    @GetMapping("/findByUniverzitet/{id}")
    public ResponseEntity<List<Fakultet>> getFakultetByUniverzitetId (@PathVariable("id") Integer id) {
        List<Fakultet> fakultet = fakultetService.findAllFakultetByUniverzitetId(id);
        return new ResponseEntity<>(fakultet, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Fakultet> addFakultet(@RequestBody Fakultet fakultet) {
        Fakultet newFakultet = fakultetService.addFakultet(fakultet);
        return new ResponseEntity<>(newFakultet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Fakultet> updateFakultet(@RequestBody Fakultet fakultet) {
        Fakultet updateFakultet = fakultetService.updateFakultet(fakultet);
        return new ResponseEntity<>(updateFakultet, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFakultet(@PathVariable("id") Integer id) {
        fakultetService.deleteFakultet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
