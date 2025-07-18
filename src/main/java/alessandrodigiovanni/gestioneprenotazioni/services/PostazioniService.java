package alessandrodigiovanni.gestioneprenotazioni.services;

import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import alessandrodigiovanni.gestioneprenotazioni.enums.Tipo;
import alessandrodigiovanni.gestioneprenotazioni.exceptions.ValidationException;
import alessandrodigiovanni.gestioneprenotazioni.repositories.PostazioniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioniService {
    @Autowired
    private PostazioniRepository postazioniRepository;
    public void savePostazione(Postazione newPostazione){
        if (newPostazione.getTipo()== null) throw new ValidationException("Il tipo di postazione è obbligatorio!");
        if (newPostazione.getNumMaxOccupanti()<= 0)throw new ValidationException("Il numero massimo di partecipanti non può essere 0!");
      postazioniRepository.save(newPostazione);
    }
    public List<Postazione> findByTipoAndEdificioCitta(Tipo tipo, String citta){
        List<Postazione> postazioni=postazioniRepository.findByTipoAndEdificioCitta(tipo,citta);
        System.out.println("Postazioni trovate per tipo: " + tipo + " e città: " + citta);
        postazioni.forEach(System.out::println);
        return postazioni;
    }

}
