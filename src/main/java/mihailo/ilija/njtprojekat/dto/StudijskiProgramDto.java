package mihailo.ilija.njtprojekat.dto;

import lombok.Data;
import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.domain.Modul;
import mihailo.ilija.njtprojekat.domain.NivoStudija;

import java.util.List;

@Data
public class StudijskiProgramDto {
    private Integer id;
    private String naziv;
    private boolean hasModul;
    private String status;
    private List<ModulDto> moduli;
    private Fakultet fakultet;
    private NivoStudija nivoStudija;

}
