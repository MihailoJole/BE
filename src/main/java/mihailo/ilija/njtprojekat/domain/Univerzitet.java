package mihailo.ilija.njtprojekat.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Univerzitet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;

    @OneToMany(mappedBy = "univerzitet")
    private List<Fakultet> fakulteti;
}
