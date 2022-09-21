package mihailo.ilija.njtprojekat.repositories;


import mihailo.ilija.njtprojekat.domain.PredmetModul;
import mihailo.ilija.njtprojekat.domain.PredmetModulPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PredmetModulRepository extends JpaRepository<PredmetModul, PredmetModulPK> {

    Collection<Object> findAllByModulId(Integer id);

    Collection<Object> findAllByModulIdOrderByGodinaAscPozicijaAsc(Integer id);
}
