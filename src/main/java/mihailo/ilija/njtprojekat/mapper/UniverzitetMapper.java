package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UniverzitetMapper {
    Univerzitet univerzitetDtoToUniverzitet (UniverzitetDto univerzitetDto);
    UniverzitetDto univerzitetToUniverzitetDto (Univerzitet univerzitet);
}
