package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import mihailo.ilija.njtprojekat.mapper.StudijskiProgramMapper;
import mihailo.ilija.njtprojekat.repositories.StudijskiProgramRepository;
import mihailo.ilija.njtprojekat.service.StudijskiProgramService;

import java.util.List;

public class StudijskiProgramServiceImpl implements StudijskiProgramService {

    StudijskiProgramRepository studijskiProgramRepository;
    StudijskiProgramMapper studijskiProgramMapper;

    public StudijskiProgramServiceImpl(StudijskiProgramRepository studijskiProgramRepository, StudijskiProgramMapper studijskiProgramMapper) {
        this.studijskiProgramRepository = studijskiProgramRepository;
        this.studijskiProgramMapper = studijskiProgramMapper;
    }

    @Override
    public List<StudijskiProgramDto> getAllByFakultetId(FakultetDto fakultetDto) {

        return null;
    }

    @Override
    public StudijskiProgramDto save(StudijskiProgramDto studijskiProgramDto) {
        return null;
    }

    @Override
    public StudijskiProgramDto update(StudijskiProgramDto studijskiProgramDto) {
        return null;
    }

    @Override
    public StudijskiProgramDto findById(int id) {
        return null;
    }
}
