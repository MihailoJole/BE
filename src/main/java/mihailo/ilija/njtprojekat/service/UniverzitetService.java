package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;

import java.util.List;

public interface UniverzitetService {
    List<Univerzitet> findAllUniverzitet();

    Univerzitet findUniverzitetById(Integer id);

    Univerzitet addUniverzitet(Univerzitet univerzitet);

    Univerzitet updateUniverzitet(Univerzitet univerzitet);

    void deleteUniverzitet(Integer id);
}
