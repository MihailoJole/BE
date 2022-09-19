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
public class Fakultet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naziv;
    private String adresa;

    //id od univerziteta, vise ka jedan

    @OneToMany(mappedBy = "fakultet")
    @JsonManagedReference
    private List<StudijskiProgram> studijskiProgrami;


    @ManyToOne
    @JoinColumn(name="univerzitet_id")
    @JsonBackReference
    private Univerzitet univerzitet;


}
