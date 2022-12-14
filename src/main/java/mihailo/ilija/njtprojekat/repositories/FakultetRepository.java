package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.Fakultet;
import mihailo.ilija.njtprojekat.domain.Univerzitet;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.UniverzitetDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FakultetRepository extends JpaRepository<Fakultet,Integer> {
    List<Fakultet> findAllFakultetByUniverzitetId(Integer univerzitetId);

}
