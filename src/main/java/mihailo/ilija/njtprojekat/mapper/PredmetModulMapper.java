package mihailo.ilija.njtprojekat.mapper;



import mihailo.ilija.njtprojekat.domain.PredmetModul;
import mihailo.ilija.njtprojekat.dto.PredmetModulResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PredmetMapper.class, ModulMapper.class})
public interface PredmetModulMapper {

    @Mapping(source = "predmetModul.predmet", target = "predmetDto")
    @Mapping(source = "predmetModul.modul", target = "modulDto")
    public PredmetModulResponseDto predmetModulToPredmetModulDto(PredmetModul predmetModul);

}
