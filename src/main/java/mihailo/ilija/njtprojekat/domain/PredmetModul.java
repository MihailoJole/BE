package mihailo.ilija.njtprojekat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PredmetModul  {


    @EmbeddedId
    private PredmetModulPK predmetModulPK= new PredmetModulPK();

    @ManyToOne
    @MapsId("predmet_id")
    private Predmet predmet;

    @ManyToOne
    @MapsId("modul_id")
    private Modul modul;
    private int semestar;
    private int pozicija;
    private boolean izborni;
    private String grupa;
    private int godina;
}
