package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.Modul;
import mihailo.ilija.njtprojekat.dto.ModulDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ModulRepository extends JpaRepository<Modul,Integer> {
    List<Modul> findAllModulByStudijskiProgramId(Integer studijskiProgramId);
}
