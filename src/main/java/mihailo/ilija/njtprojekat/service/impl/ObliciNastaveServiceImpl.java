package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.dto.OblikNastaveDto;
import mihailo.ilija.njtprojekat.mapper.OblikNastaveMapper;
import mihailo.ilija.njtprojekat.repositories.ObliciNastaveRepository;
import mihailo.ilija.njtprojekat.service.ObliciNastaveService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ObliciNastaveServiceImpl implements ObliciNastaveService {
   ObliciNastaveRepository obliciNastaveRepository;
   OblikNastaveMapper oblikNastaveMapper;

    public ObliciNastaveServiceImpl(ObliciNastaveRepository obliciNastaveRepository, OblikNastaveMapper oblikNastaveMapper) {
        this.obliciNastaveRepository = obliciNastaveRepository;
        this.oblikNastaveMapper = oblikNastaveMapper;
    }

    @Override
    public List<OblikNastaveDto> getAll() {
        return  obliciNastaveRepository.findAll().stream().map(oblikNastave -> oblikNastaveMapper.oblikNastaveToDto(oblikNastave)).collect(Collectors.toList());

    }
}
