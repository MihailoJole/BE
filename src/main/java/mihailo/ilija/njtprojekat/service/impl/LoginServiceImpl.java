package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.KorisnickiNalog;
import mihailo.ilija.njtprojekat.dto.KorisnikDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityDoesntExist;
import mihailo.ilija.njtprojekat.mapper.KorisnikMapper;
import mihailo.ilija.njtprojekat.repositories.KorisnikRepository;
import mihailo.ilija.njtprojekat.service.LoginService;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    private KorisnikRepository korisnikRepository;
    private KorisnikMapper korisnikMapper;

    public LoginServiceImpl(KorisnikRepository korisnikRepository,KorisnikMapper korisnikMapper) {
        this.korisnikRepository = korisnikRepository;
        this.korisnikMapper = korisnikMapper;
    }


    @Override
    public KorisnikDto login(String username, String password) {
        Optional<KorisnickiNalog> korisnickiNalog = korisnikRepository.findKorisnickiNalogByUsernameAndPassword(username,password);
        if(korisnickiNalog.isPresent()){
            return korisnikMapper.korisnikToKorisnikDto(korisnickiNalog.get());
        }
        else
            throw new MyEntityDoesntExist("Korisnik sa datim korisnickim imenom i lozinkom ne postoji");
    }
}
