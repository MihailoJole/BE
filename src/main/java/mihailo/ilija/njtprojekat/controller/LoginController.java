package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.dto.KorisnikDto;
import mihailo.ilija.njtprojekat.dto.LoginDto;
import mihailo.ilija.njtprojekat.service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/login")
@CrossOrigin("*")
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public KorisnikDto login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto.getUsername(),loginDto.getPassword());
    }
}
