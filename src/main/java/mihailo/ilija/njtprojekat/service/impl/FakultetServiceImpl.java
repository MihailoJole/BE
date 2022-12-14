package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.domain.Predmet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityDoesntExist;
import mihailo.ilija.njtprojekat.mapper.FakultetMapper;
import mihailo.ilija.njtprojekat.repositories.FakultetRepository;
import mihailo.ilija.njtprojekat.service.FakultetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FakultetServiceImpl implements FakultetService {

    FakultetRepository fakultetRepository;
    FakultetMapper fakultetMapper;

    public FakultetServiceImpl(FakultetRepository fakultetRepository, FakultetMapper fakultetMapper) {
        this.fakultetRepository = fakultetRepository;
        this.fakultetMapper = fakultetMapper;
    }

    @Override
    public Fakultet findFakultetById(Integer id) {
        return fakultetRepository.findById(id).get();
    }

    @Override
    public Fakultet addFakultet(Fakultet fakultet) {
        return fakultetRepository.save(fakultet);
    }

    @Override
    public Fakultet updateFakultet(Fakultet fakultet) {
        return fakultetRepository.save(fakultet);
    }

    @Override
    public void deleteFakultet(Integer id) {
        fakultetRepository.deleteById(id);
    }

    @Override
    public List<Fakultet> findAllFakultetByUniverzitetId(Integer id) {
        return  fakultetRepository.findAllFakultetByUniverzitetId(id);
    }

    @Override
    public List<Fakultet> findAllFakultet() {
        return fakultetRepository.findAll();
    }
}
