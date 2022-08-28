package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.dto.OblikNastaveDto;
import mihailo.ilija.njtprojekat.service.ObliciNastaveService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/oblikNastave")
@CrossOrigin("*")
public class OblikNastaveController {
    ObliciNastaveService obliciNastaveService;

    public OblikNastaveController(ObliciNastaveService obliciNastaveService) {
        this.obliciNastaveService = obliciNastaveService;
    }

    @GetMapping
    List<OblikNastaveDto> getAll(){
        return obliciNastaveService.getAll();

    }
}
