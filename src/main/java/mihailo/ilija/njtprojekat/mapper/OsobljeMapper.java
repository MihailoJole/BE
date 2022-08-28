package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.NastavnoOsoblje;
import mihailo.ilija.njtprojekat.dto.OsobljeDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OsobljeMapper {
    OsobljeDto osobljeToOsobljeDto(NastavnoOsoblje nastavnoOsoblje);
    NastavnoOsoblje osobljeDtoToOsoblje(OsobljeDto osobljeDto);
}
