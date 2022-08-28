package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.Predmet;
import mihailo.ilija.njtprojekat.dto.PredmetDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PredmetMapper {

    PredmetDto predmetToPredmetDto(Predmet predmet);

    Predmet predmetDtoToPredmet(PredmetDto predmetDto);
}
