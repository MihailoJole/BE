package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.domain.PredmetModulPK;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.PredmetModulDto;
import mihailo.ilija.njtprojekat.dto.PredmetModulResponseDto;

import java.util.List;

public interface PredmetModulService {
    List<PredmetModulResponseDto> getAll();
    void deleteById (PredmetModulPK predmetModulPK);
    PredmetModulResponseDto save (PredmetModulDto predmetModulDto);
    PredmetModulResponseDto update(PredmetModulDto predmetModulDto);

    List<PredmetModulResponseDto> getAllByModulId(Integer id);

    List<PredmetModulResponseDto> getAllByModulIdSortByGodinaSortByPozicija(Integer id);
}
