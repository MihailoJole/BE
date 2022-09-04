package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.domain.Modul;
import mihailo.ilija.njtprojekat.dto.ModulDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;

import java.util.List;

public interface ModulService {
    List<ModulDto> getAllBySPId(StudijskiProgramDto studijskiProgramDto);
    ModulDto save(ModulDto modulDto);
    ModulDto update(ModulDto modulDto);
    ModulDto findById(ModulDto modulDto);
    void deleteById(int id);
}
