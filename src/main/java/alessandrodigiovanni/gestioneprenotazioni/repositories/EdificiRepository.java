package alessandrodigiovanni.gestioneprenotazioni.repositories;

import alessandrodigiovanni.gestioneprenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificiRepository extends JpaRepository<Edificio,Long> {
    boolean existsByNome(String nome);
}
