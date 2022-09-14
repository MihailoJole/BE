package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.StudijskiProgram;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudijskiProgramMapper {
    StudijskiProgram studijskiProgramDtoToStudijskiProgram (StudijskiProgramDto studijskiProgramDto);
    StudijskiProgramDto studijskiProgramToStudijskiProgramDto (StudijskiProgram studijskiProgram);
}
