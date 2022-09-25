package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.domain.AngazovanjePK;
import mihailo.ilija.njtprojekat.dto.AngazovanjeDto;
import mihailo.ilija.njtprojekat.dto.AngazovanjeResponseDto;

import java.util.List;

public interface AngazovanjeService {

    List<AngazovanjeResponseDto> getAll();
    void deleteById(AngazovanjePK id);
    AngazovanjeResponseDto save(AngazovanjeDto angazovanjeDto);
    AngazovanjeResponseDto update(AngazovanjeDto angazovanjeDto);

    List<AngazovanjeResponseDto> getAllByPredmetId(Integer id);
}
