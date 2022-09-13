package mihailo.ilija.njtprojekat.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Modul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
    private int semestar;
    //id od studijskog programa, vise ka jedan
    @ManyToOne()
    @JoinColumn(name ="studijski_program_id")
    private StudijskiProgram studijskiProgram;
    //id predmeta, vise ka vise


}
