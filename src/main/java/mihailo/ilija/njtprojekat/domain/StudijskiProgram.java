package mihailo.ilija.njtprojekat.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private boolean hasModul;
    private String naziv;

    private String status;


    //id fakulteta,vise ka jedan
    @ManyToOne
    @JoinColumn(name = "fakultet_id")
    @JsonBackReference
    private Fakultet fakultet;
    //id nivo studija, vise ka jedan
    @ManyToOne
    @JoinColumn(name = "nivo_studija_id")
    @JsonBackReference
    private NivoStudija nivoStudija;

    //ako nam treba da izlistamo koje sve module ima neki studijski program
    @OneToMany(mappedBy = "studijskiProgram")
    @JsonManagedReference
    private List<Modul> moduli;
}
