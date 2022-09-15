package mihailo.ilija.njtprojekat.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class StudijskiProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naziv;
    private boolean hasModul;
    private String status;

    //ako nam treba da izlistamo koje sve module ima neki studijski program
    @OneToMany(mappedBy = "studijskiProgram")
    private List<Modul> moduli;
    //id fakulteta,vise ka jedan
    @ManyToOne
    @JoinColumn(name = "fakultet_id")
    private Fakultet fakultet;
    //id nivo studija, vise ka jedan
    @ManyToOne
    @JoinColumn(name = "nivo_studija_id")
    private NivoStudija nivoStudija;
}
