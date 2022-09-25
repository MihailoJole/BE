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

        //modul_id,predmet_id,semestar, pozicija,izborni,grupa,godina*/
        System.out.println(predmetModulDto.getPredmet_id());
        System.out.println(predmetModulDto.getModul_id());
        Optional<PredmetModul> predmetModul = predmetModulRepository.findById(new PredmetModulPK(predmetModulDto.getPredmet_id(),predmetModulDto.getModul_id()));
        if(!predmetModul.isPresent()){
            PredmetModul predmetModul1 = new PredmetModul();
            predmetModul1.setPredmet(predmetRepository.getById((predmetModulDto.getPredmet_id())));
            predmetModul1.setModul(modulRepository.getById((predmetModulDto.getModul_id())));
            predmetModul1.setSemestar(predmetModulDto.getSemestar());
            predmetModul1.setPozicija(predmetModulDto.getPozicija());
            predmetModul1.setIzborni(predmetModulDto.isIzborni());
            predmetModul1.setGrupa(predmetModulDto.getGrupa());
            predmetModul1.setGodina(predmetModulDto.getGodina());

            predmetModulRepository.save(predmetModul1);
            System.out.println(predmetModul1.getPredmetModulPK());
            return predmetModulMapper.predmetModulToPredmetModulDto(predmetModul1);
        }
        else {
            throw new MyEntityAlreadyExist("PredmetModul vec postoji");
        }
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

    @Override
    public List<PredmetModulResponseDto> getAllByModulIdSortByGodinaSortByPozicija(Integer id) {
        return predmetModulRepository.findAllByModulIdOrderByGodinaAscPozicijaAsc(id).stream().map(predmetModul ->
                predmetModulMapper.predmetModulToPredmetModulDto((PredmetModul) predmetModul)).collect(Collectors.toList());
    }
}
