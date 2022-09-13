package mihailo.ilija.njtprojekat.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class FakultetDto {
    private Integer id;
    private String naziv;
    private String adresa;
    private String oblast;
    private List<StudijskiProgramDto> studijskiProgrami;
}
