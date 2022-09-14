package mihailo.ilija.njtprojekat.service;


import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;

import java.util.List;

public interface FakultetService {

    Fakultet findFakultetById(Integer id);

    Fakultet addFakultet(Fakultet fakultet);

    Fakultet updateFakultet(Fakultet fakultet);

    void deleteFakultet(Integer id);


    List<Fakultet> findAllFakultet();


 List<Fakultet> findAllFakultetByUniverzitetId(Integer id);
}
