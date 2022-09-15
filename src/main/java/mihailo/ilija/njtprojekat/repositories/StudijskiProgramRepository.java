package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.StudijskiProgram;
import mihailo.ilija.njtprojekat.dto.FakultetDto;
import mihailo.ilija.njtprojekat.dto.StudijskiProgramDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
@Repository
public interface StudijskiProgramRepository extends JpaRepository<StudijskiProgram,Integer> {
    Collection<Object> findAllByFakultetId(Integer id);
}
