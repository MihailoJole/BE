package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.NastavnoOsoblje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OsobljeRepository extends JpaRepository<NastavnoOsoblje,Integer> {
}
