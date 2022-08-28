package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.dto.PredmetDto;

import java.util.List;

public interface PredmetService {

    List<PredmetDto> getAll();
    void deleteById(int id);
    PredmetDto save(PredmetDto predmetDto);
    PredmetDto update(PredmetDto predmetDto);
    PredmetDto findById(int id);
}
