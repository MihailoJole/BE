package mihailo.ilija.njtprojekat.repositories;

import mihailo.ilija.njtprojekat.domain.KorisnickiNalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KorisnikRepository extends JpaRepository<KorisnickiNalog,Integer> {
    Optional<KorisnickiNalog> findKorisnickiNalogByUsernameAndPassword(String username, String password);

}
