package mihailo.ilija.njtprojekat.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudijskiProgramDto {
    private Integer id;
    private String naziv;
    private boolean imaModul;
    private List<ModulDto> moduli;
}
