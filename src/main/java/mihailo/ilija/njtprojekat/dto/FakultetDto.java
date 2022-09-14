package mihailo.ilija.njtprojekat.dto;


import lombok.Data;


import java.util.List;

@Data
public class FakultetDto {
    private int id;
    private String naziv;
    private String adresa;
    private String oblast;
    private List<StudijskiProgramDto> studijskiProgrami;
    //private UniverzitetDto univerzitet;
}
