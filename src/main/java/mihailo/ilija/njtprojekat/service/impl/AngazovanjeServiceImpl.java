package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Angazovanje;
import mihailo.ilija.njtprojekat.domain.AngazovanjePK;
import mihailo.ilija.njtprojekat.dto.AngazovanjeDto;
import mihailo.ilija.njtprojekat.dto.AngazovanjeResponseDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityAlreadyExist;
import mihailo.ilija.njtprojekat.mapper.AngazovanjeMapper;
import mihailo.ilija.njtprojekat.mapper.OblikNastaveMapper;
import mihailo.ilija.njtprojekat.mapper.OsobljeMapper;
import mihailo.ilija.njtprojekat.mapper.PredmetMapper;
import mihailo.ilija.njtprojekat.repositories.AngazovanjeRepository;
import mihailo.ilija.njtprojekat.repositories.NastavnoOsobljeRepository;
import mihailo.ilija.njtprojekat.repositories.PredmetRepository;
import mihailo.ilija.njtprojekat.service.AngazovanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*@SpringBootApplication
@EntityScan("mihailo.ilija.njtprojekat.repositories.AngazovanjeRepository")
@EnableJpaRepositories("mihailo.ilija.njtprojekat.repositories")
//@ComponentScan({"mihailo.ilija.njtprojekat.repositories"})*/

@Service
public class AngazovanjeServiceImpl implements AngazovanjeService {

    AngazovanjeRepository angazovanjeRepository;
    PredmetRepository predmetRepository;
    NastavnoOsobljeRepository nastavnoOsobljeRepository;
    AngazovanjeMapper angazovanjeMapper;
    OsobljeMapper osobljeMapper;
    PredmetMapper predmetMapper;
    OblikNastaveMapper oblikNastaveMapper;

    public AngazovanjeServiceImpl(AngazovanjeRepository angazovanjeRepository, PredmetRepository predmetRepository, NastavnoOsobljeRepository nastavnoOsobljeRepository, AngazovanjeMapper angazovanjeMapper, OsobljeMapper osobljeMapper, PredmetMapper predmetMapper, OblikNastaveMapper oblikNastaveMapper) {
        this.angazovanjeRepository = angazovanjeRepository;
        this.predmetRepository = predmetRepository;
        this.nastavnoOsobljeRepository = nastavnoOsobljeRepository;
        this.angazovanjeMapper = angazovanjeMapper;
        this.oblikNastaveMapper = oblikNastaveMapper;
        this.osobljeMapper = osobljeMapper;
        this.predmetMapper = predmetMapper;
    }

    @Override
    public List<AngazovanjeResponseDto> getAll() {

        return angazovanjeRepository.findAll().stream().map(angazovanje ->
                angazovanjeMapper.angozavanjeToAngazovanjeDto(angazovanje)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(AngazovanjePK angazovanjePK) {
        angazovanjeRepository.deleteById(angazovanjePK);
    }

    @Override
    public AngazovanjeResponseDto save(AngazovanjeDto angazovanjeDto) {
        System.out.println(angazovanjeDto.getPredmet_id());
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
        }
    }
//asdasd
    @Override
    public AngazovanjeResponseDto update(AngazovanjeDto angazovanjeDto) {
        Optional<Angazovanje> angazovanje = angazovanjeRepository.findById(new AngazovanjePK(angazovanjeDto.getNastavno_osoblje_id(),angazovanjeDto.getPredmet_id()));
        if(angazovanje.isPresent()){
            Angazovanje angazovanje1 = angazovanje.get();
            angazovanje1.setPredmet(predmetRepository.getById((angazovanjeDto.getPredmet_id())));
            angazovanje1.setOblikNastave(oblikNastaveMapper.dtoToOblikNastave(angazovanjeDto.getOblikNastave()));
            angazovanje1.setNastavnoOsoblje(nastavnoOsobljeRepository.getById(angazovanjeDto.getNastavno_osoblje_id()));
            angazovanjeRepository.save(angazovanje1);
            return angazovanjeMapper.angozavanjeToAngazovanjeDto(angazovanje1);
        }
        else {
            throw new MyEntityAlreadyExist("Angazovanje za dati predmet ne postoji");
        }
    }
}
