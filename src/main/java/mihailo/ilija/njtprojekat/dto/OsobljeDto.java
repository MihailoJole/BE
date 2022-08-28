package mihailo.ilija.njtprojekat.dto;

import lombok.*;
import mihailo.ilija.njtprojekat.domain.Zvanje;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OsobljeDto {
    private int id;
    private String ime;
    private String prezime;
    private Zvanje zvanje;
}
