package mihailo.ilija.njtprojekat.controller;


import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import mihailo.ilija.njtprojekat.service.FakultetService;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping
    public List<FakultetDto> getAll() {
        return fakultetService.getAll();
    }
}
