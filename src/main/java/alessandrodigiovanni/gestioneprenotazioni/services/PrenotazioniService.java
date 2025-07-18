package alessandrodigiovanni.gestioneprenotazioni.services;

import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import alessandrodigiovanni.gestioneprenotazioni.entities.Prenotazione;
import alessandrodigiovanni.gestioneprenotazioni.entities.Utente;
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
    public Prenotazione prenotazione(Utente utente, Postazione postazione, LocalDate data) {
        // Qui sto controllando se l'utente ha già una prenotazione per quella data
        if (!prenotazioniRepository.findByUtenteAndDataPrenotazione(utente, data).isEmpty()) {
            throw new IllegalStateException("L'Utente ha già una prenotazione per questa data");
        }

        // Qui sto controllando se la postazione è già prenotata per quella data
        if (!prenotazioniRepository.findByPostazioneAndDataPrenotazione(postazione, data).isEmpty()) {
            throw new IllegalStateException("La Postazione è già prenotata per questa data");
        }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataPrenotazione(data);
        return prenotazioniRepository.save(prenotazione);
    }
}
