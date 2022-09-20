package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.dto.ModulDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import mihailo.ilija.njtprojekat.service.ModulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/modul")
@CrossOrigin("*")
public class ModulController {
    @Autowired
    ModulService modulService;

    public ModulController(ModulService modulService) {
        this.modulService = modulService;
    }

    @GetMapping("/allByStudijskiProgram/{id}")
    public ResponseEntity<List<ModulDto>> getAllByStudijskiProgramId(@PathVariable("id") Integer id){
        List<ModulDto> moduli = modulService.findAllModulByStudijskiProgramId(id);
        return new ResponseEntity<>(moduli, HttpStatus.OK);
    }

    @DeleteMapping(path="delete/{id}")
    public ResponseEntity<ModulDto> deleteById(@PathVariable Integer id) {
        modulService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
        //return ResponseEntity.status(HttpStatus.OK).body("Predmet sa id " +  id + " je izbrisan!");
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ModulDto> getModulDtoById (@PathVariable("id") Integer id) {
        ModulDto modulDto = modulService.findModulDtoById(id);
        return new ResponseEntity<>(modulDto, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ModulDto> addModulDto(@RequestBody ModulDto modulDto) {
        ModulDto newModulDto = modulService.addModulDto(modulDto);
        return new ResponseEntity<>(newModulDto, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ModulDto> updateModulDto(@RequestBody ModulDto modulDto) {
        ModulDto updateModulDto = modulService.updateModulDto(modulDto);
        return new ResponseEntity<>(updateModulDto, HttpStatus.OK);
    }

}
