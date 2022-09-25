package mihailo.ilija.njtprojekat.dto;

import lombok.Data;

@Data
public class PredmetModulDto {

    private int modul_id;
    private int predmet_id;
    private int semestar;
    private int pozicija;
    private boolean izborni;
    private String grupa;
    private int godina;
}
