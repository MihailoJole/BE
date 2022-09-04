package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FakultetMapper {
    FakultetDto fakultetToFakultetDto (Fakultet fakultet);
    Fakultet fakultetDtoToFakultet (FakultetDto fakultetDto);
}
