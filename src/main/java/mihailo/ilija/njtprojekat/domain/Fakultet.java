package mihailo.ilija.njtprojekat.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Fakultet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naziv;
    private String adresa;

    //id od univerziteta, vise ka jedan

    @OneToMany(mappedBy = "fakultet")
    private List<StudijskiProgram> studijskiProgrami;


    @ManyToOne
    @JoinColumn(name="univerzitet_id")
    private Univerzitet univerzitet;


}
