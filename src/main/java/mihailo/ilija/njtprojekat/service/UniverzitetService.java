package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;

import java.util.List;

public interface UniverzitetService {
    List<UniverzitetDto> getAll();

}
