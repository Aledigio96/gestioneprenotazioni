package alessandrodigiovanni.gestioneprenotazioni.runners;

import alessandrodigiovanni.gestioneprenotazioni.entities.Edificio;
import alessandrodigiovanni.gestioneprenotazioni.entities.Utente;
import alessandrodigiovanni.gestioneprenotazioni.services.EdificiService;
import alessandrodigiovanni.gestioneprenotazioni.services.PostazioniService;
import alessandrodigiovanni.gestioneprenotazioni.services.PrenotazioniService;
import alessandrodigiovanni.gestioneprenotazioni.services.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private PostazioniService postazioniService;
    @Autowired
    private EdificiService edificiService;
    @Autowired
    private UtentiService utentiService;
    @Autowired
    private PrenotazioniService prenotazioniService;

    public void run(String... args) throws Exception {
//        Utente utente1= new Utente("Alessandro","Di Giovanni","aledigio96","aledigio@gmail.com");
//        utentiService.saveUtente(utente1);
//        Utente utente2= new Utente("Ajeje","brazof","ajeje1900","ajeje@gmial.com");
//        utentiService.saveUtente(utente2);
//        Utente utente3= new Utente("Topo","Giogio","topogigion378","topogigione@hotmail.com");
//        utentiService.saveUtente(utente3);
//        Utente utente4= new Utente("Ballerina","Cappuccina","ballirinabella6464","ballerina@gmail.com");
//        utentiService.saveUtente(utente4);


    }
}
