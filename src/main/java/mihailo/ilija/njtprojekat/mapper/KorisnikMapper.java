package mihailo.ilija.njtprojekat.mapper;

import mihailo.ilija.njtprojekat.domain.KorisnickiNalog;
import mihailo.ilija.njtprojekat.dto.KorisnikDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KorisnikMapper {
    KorisnikDto korisnikToKorisnikDto(KorisnickiNalog korisnickiNalog);
    KorisnickiNalog korisnikDtoToKorisnik(KorisnikDto korisnikDto);

}
