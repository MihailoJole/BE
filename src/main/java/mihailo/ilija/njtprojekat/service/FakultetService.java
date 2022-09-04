package mihailo.ilija.njtprojekat.service;


import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;

import java.util.List;

public interface FakultetService {
    List<FakultetDto> getAllByUniverzitetId(UniverzitetDto univerzitetDto);

}
