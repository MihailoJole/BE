package mihailo.ilija.njtprojekat.dto;

import lombok.Data;

import java.util.List;

@Data
public class UniverzitetDto {
    private Integer id;
    private String naziv;
    private List<FakultetDto> fakulteti;
}

