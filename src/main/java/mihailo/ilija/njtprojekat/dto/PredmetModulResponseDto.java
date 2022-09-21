package mihailo.ilija.njtprojekat.dto;


import lombok.Data;

@Data
public class PredmetModulResponseDto {
    private ModulDto modulDto;
    private PredmetDto predmetDto;
    private int semestar;
    private int pozicija;
    private boolean izborni;
    private String grupa;
    private int godina;
}
