package mihailo.ilija.njtprojekat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PredmetModul {


    @EmbeddedId
    private PredmetModulPK predmetModulPK;

    private int semestar;

    @ManyToOne
    @MapsId("predmet_id")
    private Predmet predmet;

    @ManyToOne
    @MapsId("modul_id")
    private Modul modul;
}
