package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Angazovanje;
import mihailo.ilija.njtprojekat.domain.AngazovanjePK;
import mihailo.ilija.njtprojekat.domain.PredmetModul;
import mihailo.ilija.njtprojekat.domain.PredmetModulPK;
import mihailo.ilija.njtprojekat.dto.PredmetModulDto;
import mihailo.ilija.njtprojekat.dto.PredmetModulResponseDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityAlreadyExist;
import mihailo.ilija.njtprojekat.mapper.ModulMapper;
import mihailo.ilija.njtprojekat.mapper.PredmetMapper;
import mihailo.ilija.njtprojekat.mapper.PredmetModulMapper;
import mihailo.ilija.njtprojekat.repositories.ModulRepository;
import mihailo.ilija.njtprojekat.repositories.PredmetModulRepository;
import mihailo.ilija.njtprojekat.repositories.PredmetRepository;
import mihailo.ilija.njtprojekat.service.PredmetModulService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PredmetModulServiceImpl implements PredmetModulService {
    PredmetModulRepository predmetModulRepository;

    PredmetModulMapper predmetModulMapper;

    PredmetRepository predmetRepository;
    PredmetMapper predmetMapper;

    ModulMapper modulMapper;
    ModulRepository modulRepository;

    public PredmetModulServiceImpl(PredmetModulRepository predmetModulRepository, PredmetModulMapper predmetModulMapper, PredmetRepository predmetRepository, PredmetMapper predmetMapper, ModulMapper modulMapper, ModulRepository modulRepository) {
        this.predmetModulRepository = predmetModulRepository;
        this.predmetModulMapper = predmetModulMapper;
        this.predmetRepository = predmetRepository;
        this.predmetMapper = predmetMapper;
        this.modulMapper = modulMapper;
        this.modulRepository = modulRepository;
    }

    @Override
    public List<PredmetModulResponseDto> getAll() {
        return predmetModulRepository.findAll().stream().map(predmetModul ->
                predmetModulMapper.predmetModulToPredmetModulDto(predmetModul)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(PredmetModulPK predmetModulPK) {
        predmetModulRepository.deleteById(predmetModulPK);

    }

    @Override
    public PredmetModulResponseDto save(PredmetModulDto predmetModulDto) {
       /* System.out.println(angazovanjeDto.getPredmet_id());
        System.out.println(angazovanjeDto.getNastavno_osoblje_id());
        Optional<Angazovanje> angazovanje = angazovanjeRepository.findById(new AngazovanjePK(angazovanjeDto.getPredmet_id(),angazovanjeDto.getNastavno_osoblje_id()));
        if(!angazovanje.isPresent()){
            Angazovanje angazovanje1 = new Angazovanje();
            angazovanje1.setPredmet(predmetRepository.getById((angazovanjeDto.getPredmet_id())));
            angazovanje1.setOblikNastave(oblikNastaveMapper.dtoToOblikNastave(angazovanjeDto.getOblikNastave()));
            angazovanje1.setNastavnoOsoblje(nastavnoOsobljeRepository.getById(angazovanjeDto.getNastavno_osoblje_id()));
            angazovanjeRepository.save(angazovanje1);
            return angazovanjeMapper.angozavanjeToAngazovanjeDto(angazovanje1);
        }
        else {
            throw new MyEntityAlreadyExist("Angazovanje za dati predmet vec postoji");
        }*/
        return null;
    }

    @Override
    public PredmetModulResponseDto update(PredmetModulDto predmetModulDto) {
        return null;
    }

    @Override
    public List<PredmetModulResponseDto> getAllByModulId(Integer id) {
        return predmetModulRepository.findAllByModulId(id).stream().map(predmetModul ->
                predmetModulMapper.predmetModulToPredmetModulDto((PredmetModul) predmetModul)).collect(Collectors.toList());
    }
}
