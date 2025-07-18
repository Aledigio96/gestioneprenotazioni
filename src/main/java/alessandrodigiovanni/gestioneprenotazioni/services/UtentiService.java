package alessandrodigiovanni.gestioneprenotazioni.services;

import alessandrodigiovanni.gestioneprenotazioni.entities.Utente;
import alessandrodigiovanni.gestioneprenotazioni.exceptions.ValidationException;
import alessandrodigiovanni.gestioneprenotazioni.repositories.UtentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtentiService {
    @Autowired
    private UtentiRepository utentiRepository;

    public void saveUtente(Utente newUtente){
        if (utentiRepository.existsByEmail(newUtente.getEmail())) throw new ValidationException("Email " + newUtente.getEmail() + " già in uso");
        if (utentiRepository.existsByUsername(newUtente.getUsername())) throw new ValidationException("Username già in uso!");
        utentiRepository.save(newUtente);
        System.out.println("Utente creato con successo!");
    }

}
