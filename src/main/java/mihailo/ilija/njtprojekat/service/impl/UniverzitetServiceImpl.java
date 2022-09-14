package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import mihailo.ilija.njtprojekat.mapper.UniverzitetMapper;
import mihailo.ilija.njtprojekat.repositories.UniverzitetRepository;
import mihailo.ilija.njtprojekat.service.UniverzitetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UniverzitetServiceImpl implements UniverzitetService {

    UniverzitetRepository univerzitetRepository;
    UniverzitetMapper univerzitetMapper;

    public UniverzitetServiceImpl(UniverzitetRepository univerzitetRepository, UniverzitetMapper univerzitetMapper) {
        this.univerzitetRepository = univerzitetRepository;
        this.univerzitetMapper = univerzitetMapper;
    }

    /*@Override
    public List<UniverzitetDto> getAll() {
        return univerzitetRepository.findAll().stream().map(univerzitet -> univerzitetMapper.univerzitetToUniverzitetDto(univerzitet)).collect(Collectors.toList());
    }*/


    @Override
    public List<Univerzitet> findAllUniverzitet() {
        return univerzitetRepository.findAll();
    }

    @Override
    public Univerzitet findUniverzitetById(Integer id) {
        return univerzitetRepository.findById(id).get();
    }

    @Override
    public Univerzitet addUniverzitet(Univerzitet univerzitet) {

        return univerzitetRepository.save(univerzitet);
    }

    @Override
    public Univerzitet updateUniverzitet(Univerzitet univerzitet) {
        return univerzitetRepository.save(univerzitet);

    }

    @Override
    public void deleteUniverzitet(Integer id) {
        univerzitetRepository.deleteById(id);

    }
}
