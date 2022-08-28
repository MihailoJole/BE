package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.dto.OsobljeDto;
import mihailo.ilija.njtprojekat.mapper.OsobljeMapper;
import mihailo.ilija.njtprojekat.repositories.OsobljeRepository;
import mihailo.ilija.njtprojekat.service.OsobljeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OsobljeServiceImpl implements OsobljeService {

    OsobljeRepository osobljeRepository;
    OsobljeMapper osobljeMapper;

    public OsobljeServiceImpl(OsobljeRepository osobljeRepository,OsobljeMapper osobljeMapper) {
        this.osobljeRepository = osobljeRepository;
        this.osobljeMapper = osobljeMapper;
    }

    @Override
    public List<OsobljeDto> getAll() {
        return osobljeRepository.findAll().stream().map(osoblje -> osobljeMapper.osobljeToOsobljeDto(osoblje)).collect(Collectors.toList());
    }
}
