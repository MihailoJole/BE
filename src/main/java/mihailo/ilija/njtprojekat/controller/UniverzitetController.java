package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import mihailo.ilija.njtprojekat.service.UniverzitetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public List<UniverzitetDto> getAll(){
        System.out.println(univerzitetService.getAll().toString());
        return univerzitetService.getAll();
    }
}
