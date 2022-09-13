package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import mihailo.ilija.njtprojekat.mapper.FakultetMapper;
import mihailo.ilija.njtprojekat.repositories.FakultetRepository;
import mihailo.ilija.njtprojekat.service.FakultetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FakultetServiceImpl implements FakultetService {

    FakultetRepository fakultetRepository;
    FakultetMapper fakultetMapper;

    public FakultetServiceImpl(FakultetRepository fakultetRepository, FakultetMapper fakultetMapper) {
        this.fakultetRepository = fakultetRepository;
        this.fakultetMapper = fakultetMapper;
    }




//    @Override
//    public List<FakultetDto> getAllByUniverzitetId(UniverzitetDto univerzitetDto) {
//        return fakultetRepository.findAllByUniverzitetId(univerzitetDto.getId());
//    }


    @Override
    public List<FakultetDto> getAllByUniverzitetId(UniverzitetDto univerzitetDto) {
        return null;
    }

    @Override
    public List<FakultetDto> getAll() {
        return fakultetRepository.findAll().stream().map(fakultet -> fakultetMapper.fakultetToFakultetDto(fakultet)).collect(Collectors.toList());
    }
}
