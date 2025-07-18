package alessandrodigiovanni.gestioneprenotazioni.services;

import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import alessandrodigiovanni.gestioneprenotazioni.entities.Prenotazione;

import alessandrodigiovanni.gestioneprenotazioni.exceptions.ValidationException;
import alessandrodigiovanni.gestioneprenotazioni.repositories.PrenotazioniRepository;
import alessandrodigiovanni.gestioneprenotazioni.repositories.UtentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrenotazioniService {

    @Autowired
    private PrenotazioniRepository prenotazioniRepository;

    @Autowired private UtentiRepository utenteRepository;

public void savePrenotazione(Prenotazione newPrenotazione) {
    if (prenotazioniRepository.existsByDataPrenotazioneAndPostazione(newPrenotazione.getDataPrenotazione(), newPrenotazione.getPostazione())) {
        throw new ValidationException("Esiste già una prenotazione per la data che hai richiesto");
    }
    if (prenotazioniRepository.existsByUtenteAndDataPrenotazione(newPrenotazione.getUtente(), newPrenotazione.getDataPrenotazione())){
        throw new ValidationException("L'utente ha gia una prenotazione per questa data");
    }
    prenotazioniRepository.save(newPrenotazione);
    System.out.println("Prenotazione avvenuta con successo!");
}



}
