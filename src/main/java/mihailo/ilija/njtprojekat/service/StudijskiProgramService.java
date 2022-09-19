package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudijskiProgramService {


    List<StudijskiProgramDto> findAllByFakultetId(Integer id);

    void deleteById(int id);

    StudijskiProgramDto updateStudijskiProgramDto(StudijskiProgramDto studijskiProgramDto);

    StudijskiProgramDto addStudijskiProgramDto(StudijskiProgramDto studijskiProgramDto);

    StudijskiProgramDto findStudijskiProgramDtoById(Integer id);

    List<StudijskiProgramDto> getAll();
}
