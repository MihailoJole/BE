package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.OblikNastave;
import mihailo.ilija.njtprojekat.dto.OblikNastaveDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OblikNastaveMapper {
    OblikNastaveDto oblikNastaveToDto(OblikNastave oblikNastaveDto);
    OblikNastave dtoToOblikNastave(OblikNastaveDto oblikNastave);
}
