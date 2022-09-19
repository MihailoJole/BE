package mihailo.ilija.njtprojekat.service;

import mihailo.ilija.njtprojekat.domain.Modul;
import mihailo.ilija.njtprojekat.dto.ModulDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;

import java.util.List;

public interface ModulService {

    void deleteById(int id);

    List<ModulDto> findAllModulByStudijskiProgramId(Integer id);

    ModulDto findModulDtoById(Integer id);

    ModulDto addModulDto(ModulDto modulDto);

    ModulDto updateModulDto(ModulDto modulDto);
}
