package alessandrodigiovanni.gestioneprenotazioni.services;

import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import alessandrodigiovanni.gestioneprenotazioni.exceptions.ValidationException;
import alessandrodigiovanni.gestioneprenotazioni.repositories.PostazioniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioniService {
    @Autowired
    private PostazioniRepository postazioniRepository;
    public void savePostazione(Postazione newPostazione){
        if (newPostazione.getTipo()== null) throw new ValidationException("Il tipo di postazione è obbligatorio!");
        if (newPostazione.getNumMaxOccupanti()<= 0)throw new ValidationException("Il numero massimo di partecipanti non può essere 0!");
      postazioniRepository.save(newPostazione);
    }

}
