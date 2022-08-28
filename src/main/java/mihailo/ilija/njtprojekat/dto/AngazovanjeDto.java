package mihailo.ilija.njtprojekat.dto;

import lombok.Data;

@Data
public class AngazovanjeDto {
    private int nastavno_osoblje_id;
    private int predmet_id;
    private OblikNastaveDto oblikNastave;
}
