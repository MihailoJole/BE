package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;


@Mapper(componentModel = "spring")
public interface FakultetMapper {
    FakultetDto fakultetToFakultetDto (Fakultet fakultet);
    Fakultet fakultetDtoToFakultet (FakultetDto fakultetDto);
}
