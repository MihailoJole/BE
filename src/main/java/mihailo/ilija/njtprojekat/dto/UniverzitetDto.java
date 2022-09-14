package mihailo.ilija.njtprojekat.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class UniverzitetDto {
    private int id;
    private String naziv;
    private List<FakultetDto> fakulteti;


}

