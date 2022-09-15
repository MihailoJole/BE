package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.Modul;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ModulRepository extends JpaRepository<Modul,Integer> {
    Collection<Object> findAllByStudijskiProgramId(Integer id);
}
