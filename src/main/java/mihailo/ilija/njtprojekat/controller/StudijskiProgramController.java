package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import mihailo.ilija.njtprojekat.service.StudijskiProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@SpringBootApplication
//@EntityScan("mihailo.ilija.njtprojekat.service.StudijskiProgramService")*/
/*@EnableJpaRepositories("mihailo.ilija.njtprojekat.repositories.StudijskiProgramRepository")*/
//@ComponentScan({"mihailo.ilija.njtprojekat.service"})
@RestController
@RequestMapping(path = "/studijskiprogram")
@CrossOrigin("*")
public class StudijskiProgramController {
    @Autowired
    StudijskiProgramService studijskiProgramService;

    public StudijskiProgramController(StudijskiProgramService studijskiProgramService) {
        this.studijskiProgramService = studijskiProgramService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudijskiProgramDto>> getAll(){
        List<StudijskiProgramDto> studijskiProgrami = studijskiProgramService.getAll();
        return new ResponseEntity<>(studijskiProgrami, HttpStatus.OK);
    }

    @GetMapping("/allByFakultet/{id}")
    public ResponseEntity<List<StudijskiProgramDto>> getAllByFakultetId(@PathVariable("id") Integer id){
        List<StudijskiProgramDto> studijskiProgrami = studijskiProgramService.findAllByFakultetId(id);
        return new ResponseEntity<>(studijskiProgrami, HttpStatus.OK);
    }

    @DeleteMapping(path="delete/{id}")
    public ResponseEntity<StudijskiProgramDto> deleteById(@PathVariable Integer id) {
        studijskiProgramService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
        //return ResponseEntity.status(HttpStatus.OK).body("Predmet sa id " +  id + " je izbrisan!");
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<StudijskiProgramDto> getStudijskiProgramDtoById (@PathVariable("id") Integer id) {
        StudijskiProgramDto studijskiProgramDto = studijskiProgramService.findStudijskiProgramDtoById(id);
        return new ResponseEntity<>(studijskiProgramDto, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<StudijskiProgramDto> addStudijskiProgramDto(@RequestBody StudijskiProgramDto studijskiProgramDto) {
        StudijskiProgramDto newStudijskiProgramDto = studijskiProgramService.addStudijskiProgramDto(studijskiProgramDto);
        return new ResponseEntity<>(newStudijskiProgramDto, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<StudijskiProgramDto> updateStudijskiProgramDto(@RequestBody StudijskiProgramDto studijskiProgramDto) {
        StudijskiProgramDto updateStudijskiProgramDto = studijskiProgramService.updateStudijskiProgramDto(studijskiProgramDto);
        return new ResponseEntity<>(updateStudijskiProgramDto, HttpStatus.OK);
    }

}
