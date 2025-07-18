package alessandrodigiovanni.gestioneprenotazioni.repositories;

import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazione,Long> {
}
