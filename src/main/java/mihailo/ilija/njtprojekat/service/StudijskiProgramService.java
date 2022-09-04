package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;

import java.util.List;

public interface StudijskiProgramService {
    List<StudijskiProgramDto> getAllByFakultetId(FakultetDto fakultetDto);
    StudijskiProgramDto save(StudijskiProgramDto studijskiProgramDto);
    StudijskiProgramDto update(StudijskiProgramDto studijskiProgramDto);
    StudijskiProgramDto findById(int id);

}
