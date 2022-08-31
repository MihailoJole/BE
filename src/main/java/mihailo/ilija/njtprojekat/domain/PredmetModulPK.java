package mihailo.ilija.njtprojekat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class PredmetModulPK implements Serializable {

    private static final long serialVersionUID = 1L;


    private int predmet_id;
    private int modul_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PredmetModulPK that = (PredmetModulPK) o;
        return predmet_id == that.predmet_id && modul_id == that.modul_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmet_id, modul_id);
    }
}
