package mihailo.ilija.njtprojekat.dto;

import lombok.Data;
import mihailo.ilija.njtprojekat.domain.Rola;
@Data
public class KorisnikDto {
    private int id;
    private String username;
    private Rola rola;
    private OsobljeDto nastavnoOsoblje;

}
