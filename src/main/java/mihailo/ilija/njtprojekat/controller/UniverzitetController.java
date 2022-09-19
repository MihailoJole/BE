package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import mihailo.ilija.njtprojekat.service.UniverzitetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/univerzitet")
@CrossOrigin("*")
public class UniverzitetController {
    @Autowired
    private UniverzitetService univerzitetService;
    public UniverzitetController() {
    }
    public UniverzitetController(UniverzitetService univerzitetService) {
        this.univerzitetService = univerzitetService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Univerzitet>> getAllUniverzitet () {
        List<Univerzitet> univerziteti = univerzitetService.findAllUniverzitet();
        return new ResponseEntity<>(univerziteti, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Univerzitet> getUniverzitetById (@PathVariable("id") Integer id) {
        Univerzitet univerzitet = univerzitetService.findUniverzitetById(id);
        return new ResponseEntity<>(univerzitet, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Univerzitet> addUniverzitet(@RequestBody Univerzitet univerzitet) {
        Univerzitet newUniverzitet = univerzitetService.addUniverzitet(univerzitet);
        return new ResponseEntity<>(newUniverzitet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Univerzitet> updateUniverzitet(@RequestBody Univerzitet univerzitet) {
        Univerzitet updateUniverzitet = univerzitetService.updateUniverzitet(univerzitet);
        return new ResponseEntity<>(updateUniverzitet, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUniverzitet(@PathVariable("id") Integer id) {
        univerzitetService.deleteUniverzitet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
