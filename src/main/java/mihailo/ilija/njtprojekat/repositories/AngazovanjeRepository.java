package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.Angazovanje;
import mihailo.ilija.njtprojekat.domain.AngazovanjePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AngazovanjeRepository extends JpaRepository<Angazovanje, AngazovanjePK> {
    Collection<Object> findAllAngazovanjeByPredmetId(Integer id);
}
