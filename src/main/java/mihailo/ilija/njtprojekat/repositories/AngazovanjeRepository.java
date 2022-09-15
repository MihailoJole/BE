package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.Angazovanje;
import mihailo.ilija.njtprojekat.domain.AngazovanjePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngazovanjeRepository extends JpaRepository<Angazovanje, AngazovanjePK> {
}
