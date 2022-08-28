package mihailo.ilija.njtprojekat.controller;


import mihailo.ilija.njtprojekat.dto.OsobljeDto;
import mihailo.ilija.njtprojekat.service.OsobljeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/osoblje")
@CrossOrigin("*")
public class OsobljeController {
    OsobljeService osobljeService;

    public OsobljeController(OsobljeService osobljeService) {
        this.osobljeService = osobljeService;
    }

    @GetMapping
    public List<OsobljeDto> getAll(){
        return osobljeService.getAll();
    }

}
