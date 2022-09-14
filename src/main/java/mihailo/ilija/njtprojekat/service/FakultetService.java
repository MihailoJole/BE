package mihailo.ilija.njtprojekat.service;


import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;

import java.util.List;

public interface FakultetService {



    List<FakultetDto> getAllByUniverzitet(int univerzitetId);

    List<FakultetDto> getAll();

}
