package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Predmet;
import mihailo.ilija.njtprojekat.domain.StudijskiProgram;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityDoesntExist;
import mihailo.ilija.njtprojekat.mapper.StudijskiProgramMapper;
import mihailo.ilija.njtprojekat.repositories.StudijskiProgramRepository;
import mihailo.ilija.njtprojekat.service.StudijskiProgramService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class StudijskiProgramServiceImpl implements StudijskiProgramService {

    StudijskiProgramRepository studijskiProgramRepository;
    StudijskiProgramMapper studijskiProgramMapper;

    public StudijskiProgramServiceImpl(StudijskiProgramRepository studijskiProgramRepository, StudijskiProgramMapper studijskiProgramMapper) {
        this.studijskiProgramRepository = studijskiProgramRepository;
        this.studijskiProgramMapper = studijskiProgramMapper;
    }


    @Override
    public List<StudijskiProgramDto> findAllByFakultetId(Integer id) {
        return studijskiProgramRepository.findAllByFakultetId(id).stream().map(
                studijskiProgram -> studijskiProgramMapper.studijskiProgramToStudijskiProgramDto((StudijskiProgram) studijskiProgram)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(int id) {
        Optional<StudijskiProgram> studijskiProgram = studijskiProgramRepository.findById(id);
        if(studijskiProgram.isPresent()){
            //StudijskiProgram sp = studijskiProgram.get();
            //.setAktivan(false);
            studijskiProgramRepository.deleteById(id);
        }
        else
            throw new MyEntityDoesntExist("Ne postoji studijski program sa datim id!");

    }

    @Override
    public StudijskiProgramDto updateStudijskiProgramDto(StudijskiProgramDto studijskiProgramDto) {
        Optional<StudijskiProgram> studijskiProgram = studijskiProgramRepository.findById(studijskiProgramDto.getId());
        if(studijskiProgram.isPresent()){
            StudijskiProgram newStudijskiProgram = studijskiProgramRepository.save(studijskiProgramMapper.studijskiProgramDtoToStudijskiProgram(studijskiProgramDto));
            return studijskiProgramMapper.studijskiProgramToStudijskiProgramDto(newStudijskiProgram);
        }else {
            throw new MyEntityDoesntExist("Ne postoji studijski program sa datim id");
        }
    }

    @Override
    public StudijskiProgramDto addStudijskiProgramDto(StudijskiProgramDto studijskiProgramDto) {
        /*StudijskiProgram newStudijskiProgram = new StudijskiProgram();
        newStudijskiProgram.setNaziv(studijskiProgramDto.getNaziv());
        newStudijskiProgram.setStatus(studijskiProgramDto.get());
        newStudijskiProgram.setOpis(predmetDto.getOpis());
        newStudijskiProgram.setObliciNastave(predmetDto.getObliciNastave().stream().map(oblikNastaveDto -> oblikNastaveMapper.dtoToOblikNastave(oblikNastaveDto)).collect(Collectors.toList()));
        newStudijskiProgram.setNaziv(predmetDto.getNaziv());
        studijskiProgramRepository.save(newPredmet);
        System.out.println(newStudijskiProgram.getId());
        return studijskiProgramMapper.studijskiProgramToStudijskiProgramDto(newStudijskiProgram);*/
        return null;
    }

    @Override
    public StudijskiProgramDto findStudijskiProgramDtoById(Integer id) {
        Optional<StudijskiProgram> studijskiProgram = studijskiProgramRepository.findById(id);
        if(studijskiProgram.isPresent()){
            return studijskiProgramMapper.studijskiProgramToStudijskiProgramDto(studijskiProgram.get());
        }else {
            throw new MyEntityDoesntExist("Ne postoji studijski program sa datim id");
        }

    }

}
