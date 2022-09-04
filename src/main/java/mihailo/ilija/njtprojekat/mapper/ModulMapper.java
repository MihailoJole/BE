package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.Modul;
import mihailo.ilija.njtprojekat.dto.ModulDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModulMapper {
    ModulDto modulToModulDto (Modul modul);
    Modul modulDtoToModul (ModulDto modulDto);
}
