package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Predmet;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityDoesntExist;
import mihailo.ilija.njtprojekat.mapper.OblikNastaveMapper;
import mihailo.ilija.njtprojekat.mapper.PredmetMapper;
import mihailo.ilija.njtprojekat.repositories.PredmetRepository;
import mihailo.ilija.njtprojekat.service.PredmetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PredmetServiceImpl implements PredmetService {
    private PredmetRepository predmetRepository;
    private PredmetMapper predmetMapper;

    private OblikNastaveMapper oblikNastaveMapper;
    public PredmetServiceImpl(PredmetRepository predmetRepository,PredmetMapper predmetMapper,OblikNastaveMapper oblikNastaveMapper) {
        this.predmetRepository = predmetRepository;
        this.predmetMapper = predmetMapper;
        this.oblikNastaveMapper = oblikNastaveMapper;
    }

    @Override
    public List<PredmetDto> getAll() {
        return predmetRepository.findAll().stream().map(
                predmet -> predmetMapper.predmetToPredmetDto(predmet)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(int id) {
        Optional<Predmet> predmet = predmetRepository.findById(id);
        if(predmet.isPresent()){
            Predmet p = predmet.get();
            p.setAktivan(false);
            predmetRepository.save(p);
        }
        else
            throw new MyEntityDoesntExist("Ne postoji predmet sa datim id!");
    }

    @Override
    public PredmetDto save(PredmetDto predmetDto) {
        Predmet newPredmet = new Predmet();
        newPredmet.setAktivan(predmetDto.isAktivan());
        newPredmet.setEspb(predmetDto.getEspb());
        newPredmet.setOpis(predmetDto.getOpis());
        newPredmet.setObliciNastave(predmetDto.getObliciNastave().stream().map(oblikNastaveDto -> oblikNastaveMapper.dtoToOblikNastave(oblikNastaveDto)).collect(Collectors.toList()));
        newPredmet.setNaziv(predmetDto.getNaziv());
        predmetRepository.save(newPredmet);
        System.out.println(newPredmet.getId());
        return predmetMapper.predmetToPredmetDto(newPredmet);
    }
    @Override
    public PredmetDto update(PredmetDto predmetDto) {
        Optional<Predmet> predmet = predmetRepository.findById(predmetDto.getId());
        if(predmet.isPresent()){
            Predmet newPredmet = predmetRepository.save(predmetMapper.predmetDtoToPredmet(predmetDto));
            return predmetMapper.predmetToPredmetDto(newPredmet);

        }
        else {
            throw new MyEntityDoesntExist("Ne postoji predmet sa datim id");
        }
    }

    @Override
    public PredmetDto findById(int id) {
        Optional<Predmet> predmet = predmetRepository.findById(id);
        if(predmet.isPresent()){
            return predmetMapper.predmetToPredmetDto(predmet.get());
        }else {
            throw new MyEntityDoesntExist("Ne postoji predmet sa datim id");
        }

    }
}
