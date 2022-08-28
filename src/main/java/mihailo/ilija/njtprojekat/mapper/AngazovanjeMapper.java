package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.Angazovanje;
import mihailo.ilija.njtprojekat.dto.AngazovanjeResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {OsobljeMapper.class,PredmetMapper.class,OblikNastaveMapper.class})
public interface AngazovanjeMapper {


    @Mapping(source = "angazovanje.predmet", target = "predmetDto")
    @Mapping(source = "angazovanje.nastavnoOsoblje", target = "osobljeDto")
    public AngazovanjeResponseDto angozavanjeToAngazovanjeDto(Angazovanje angazovanje);
}
