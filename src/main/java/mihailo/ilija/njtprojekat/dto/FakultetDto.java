package mihailo.ilija.njtprojekat.dto;


import lombok.Data;

import java.util.List;

@Data
public class FakultetDto {
    private Integer id;
    private String naziv;
    private String oblast;
    private String adresa;
    private List<StudijskiProgramDto> studijskiProgrami;
}
