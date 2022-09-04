package mihailo.ilija.njtprojekat.dto;


import lombok.Data;

@Data
public class PredmetModulResponseDto {
    private ModulDto modul;
    private PredmetDto predmet;
    private int semestar;
}
