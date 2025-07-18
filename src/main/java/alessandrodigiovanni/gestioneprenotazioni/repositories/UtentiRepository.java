package alessandrodigiovanni.gestioneprenotazioni.repositories;

import alessandrodigiovanni.gestioneprenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtentiRepository extends JpaRepository<Utente,Long> {


    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
