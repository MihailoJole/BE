package mihailo.ilija.njtprojekat.dto;

import lombok.Data;
import mihailo.ilija.njtprojekat.domain.StudijskiProgram;

@Data
public class ModulDto {
    private Integer id;
    private String naziv;
    private int semestar;
    private StudijskiProgram studijskiProgram;
}
