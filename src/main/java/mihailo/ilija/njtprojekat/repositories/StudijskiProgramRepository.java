package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.StudijskiProgram;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudijskiProgramRepository extends JpaRepository<StudijskiProgram,Integer> {
}
