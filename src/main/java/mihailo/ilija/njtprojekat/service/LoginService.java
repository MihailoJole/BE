package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.dto.KorisnikDto;

public interface LoginService {

    KorisnikDto login(String username, String password);
}
