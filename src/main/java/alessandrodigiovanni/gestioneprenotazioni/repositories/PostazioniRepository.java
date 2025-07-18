package alessandrodigiovanni.gestioneprenotazioni.repositories;

import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import alessandrodigiovanni.gestioneprenotazioni.enums.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazione,Long> {

}
