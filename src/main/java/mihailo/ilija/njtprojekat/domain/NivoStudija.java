package mihailo.ilija.njtprojekat.domain;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class NivoStudija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
//treba  napraviti na frontu nivo studija razmisliti o tome jer onda ima vise vise ka fakultetu vezu i pitanje dal nam treba i samo dal da bacimo kao string
    @OneToMany(mappedBy = "nivoStudija")
    @JsonManagedReference
    private List<StudijskiProgram> studijskiProgrami;

}
