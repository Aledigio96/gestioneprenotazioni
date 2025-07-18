package alessandrodigiovanni.gestioneprenotazioni.services;

import alessandrodigiovanni.gestioneprenotazioni.entities.Edificio;
import alessandrodigiovanni.gestioneprenotazioni.exceptions.NotFoundException;
import alessandrodigiovanni.gestioneprenotazioni.exceptions.ValidationException;
import alessandrodigiovanni.gestioneprenotazioni.repositories.EdificiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificiService {
    @Autowired
    private EdificiRepository edificiRepository;

    public void saveEdificio(Edificio newEdificio){
        if (edificiRepository.existsByNome(newEdificio.getNome())) throw new ValidationException("Edificio con " + newEdificio.getNome() + "esiste già");
        edificiRepository.save(newEdificio);
    }
    public Edificio findById(long edificioId) {
        return edificiRepository.findById(edificioId).orElseThrow(() -> new
                NotFoundException(edificioId));
    }
}
