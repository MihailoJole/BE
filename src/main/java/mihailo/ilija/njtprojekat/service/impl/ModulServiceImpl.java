package mihailo.ilija.njtprojekat.service.impl;

import mihailo.ilija.njtprojekat.domain.Modul;
import mihailo.ilija.njtprojekat.domain.StudijskiProgram;
import mihailo.ilija.njtprojekat.dto.ModulDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import mihailo.ilija.njtprojekat.exceptions.MyEntityDoesntExist;
import mihailo.ilija.njtprojekat.mapper.ModulMapper;
import mihailo.ilija.njtprojekat.repositories.ModulRepository;
import mihailo.ilija.njtprojekat.service.ModulService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ModulServiceImpl implements ModulService {
    ModulRepository modulRepository;

    ModulMapper modulMapper;

    public ModulServiceImpl(ModulRepository modulRepository, ModulMapper modulMapper) {
        this.modulRepository = modulRepository;
        this.modulMapper = modulMapper;
    }

    @Override
    public void deleteById(int id) {
        Optional<Modul> modul = modulRepository.findById(id);
        if( modul.isPresent()){
            //StudijskiProgram sp = studijskiProgram.get();
            //.setAktivan(false);
            modulRepository.deleteById(id);
        }
        else
            throw new MyEntityDoesntExist("Ne postoji modul sa datim id!");
    }

    @Override
    public List<ModulDto> findAllModulByStudijskiProgramId(Integer id) {
        return modulRepository.findAllModulByStudijskiProgramId(id).stream().map(
                modul -> modulMapper.modulToModulDto((Modul) modul)).collect(Collectors.toList());
    }

    @Override
    public ModulDto findModulDtoById(Integer id) {
        Optional<Modul> modul = modulRepository.findById(id);
        if(modul.isPresent()){
            return modulMapper.modulToModulDto(modul.get());
        }else {
            throw new MyEntityDoesntExist("Ne postoji modul sa datim id");
        }
    }

    @Override
    public ModulDto addModulDto(ModulDto modulDto) {
        /*Modul newModul = new Modul();
        newModul.setNaziv(studijskiProgramDto.getNaziv());
        newModul.setStatus(studijskiProgramDto.get());
        newModul.setOpis(predmetDto.getOpis());
        newModul.setObliciNastave(predmetDto.getObliciNastave().stream().map(oblikNastaveDto -> oblikNastaveMapper.dtoToOblikNastave(oblikNastaveDto)).collect(Collectors.toList()));
        newModul.setNaziv(predmetDto.getNaziv());
        modulRepository.save(newModul);
        System.out.println(newModul.getId());
        return modulMapper.modulToModulDto(newModul);*/
        return null;
    }

    @Override
    public ModulDto updateModulDto(ModulDto modulDto) {
        Optional<Modul> modul = modulRepository.findById(modulDto.getId());
        if(modul.isPresent()){
            Modul newModul = modulRepository.save(modulMapper.modulDtoToModul(modulDto));
            return modulMapper.modulToModulDto(newModul);
        }else {
            throw new MyEntityDoesntExist("Ne postoji modul sa datim id");
        }
    }
}
