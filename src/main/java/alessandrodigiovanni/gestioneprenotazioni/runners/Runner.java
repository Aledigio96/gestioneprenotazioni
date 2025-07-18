package alessandrodigiovanni.gestioneprenotazioni.runners;

import alessandrodigiovanni.gestioneprenotazioni.entities.Edificio;
import alessandrodigiovanni.gestioneprenotazioni.entities.Postazione;
import alessandrodigiovanni.gestioneprenotazioni.entities.Prenotazione;
import alessandrodigiovanni.gestioneprenotazioni.entities.Utente;
import alessandrodigiovanni.gestioneprenotazioni.enums.Tipo;
import alessandrodigiovanni.gestioneprenotazioni.services.EdificiService;
import alessandrodigiovanni.gestioneprenotazioni.services.PostazioniService;
import alessandrodigiovanni.gestioneprenotazioni.services.PrenotazioniService;
import alessandrodigiovanni.gestioneprenotazioni.services.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
          Utente utenteFromDb= utentiService.findById(1);
          Utente utenteFromDb2=utentiService.findById(2);
          Utente utenteFromDb3=utentiService.findById(3);
          Utente utenteFromDb4=utentiService.findById(4);

//        Edificio edificio1=new Edificio("Palazzo dei congressi","via partenope 36","Roma");
//        edificiService.saveEdificio(edificio1);
//        Edificio edificio2= new Edificio("Palazzo delle belle arti","via valle del fuoco 45","Napoli");
//        edificiService.saveEdificio(edificio2);
//        Edificio edificio3=new Edificio("Reggia di Caserta","via cincillà 32","Caserta");
//        edificiService.saveEdificio(edificio3);
//        Edificio edificio4= new Edificio("Quirinale","via nanannana 123","Palermo");
//        edificiService.saveEdificio(edificio4);
          Edificio edificiofromdb= edificiService.findById(1);
          Edificio edificiofromdb2= edificiService.findById(2);
          Edificio edificiofromdb3= edificiService.findById(3);
          Edificio edificiofromdb4= edificiService.findById(4);
//        Postazione postazione1=new Postazione("Sala conferenze con bellime volte", Tipo.OPENSPACE,300,edificiofromdb);
//        postazioniService.savePostazione(postazione1);
//        Postazione postazione2=new Postazione("Sala Riunioni con schermo per presentazioni",Tipo.SALA_RIUNIONI,100,edificiofromdb2);
//        postazioniService.savePostazione(postazione2);
//        Postazione postazione3=new Postazione("Incredibile e monumentale edifico",Tipo.PRIVATO,500,edificiofromdb3);
//        postazioniService.savePostazione(postazione3);
//        Postazione postazione4= new Postazione("Assurdo bellissimo incredibile",Tipo.OPENSPACE,50,edificiofromdb4);
//        postazioniService.savePostazione(postazione4);
          Postazione postazioneFromDb=postazioniService.findById(1);
          Postazione postazioneFromDb2=postazioniService.findById(2);
          Postazione postazioneFromDb3=postazioniService.findById(3);
          Postazione postazioneFromDb4=postazioniService.findById(4);

//        Prenotazione prenotazione1=new Prenotazione(postazioneFromDb,utenteFromDb, LocalDate.of(2025,12,03));
//       prenotazioniService.savePrenotazione(prenotazione1);
//        Prenotazione prenotazione2= new Prenotazione(postazioneFromDb2,utenteFromDb2,LocalDate.of(2025,7,11));
//        prenotazioniService.savePrenotazione(prenotazione2);
//        Prenotazione prenotazione3=new Prenotazione(postazioneFromDb3,utenteFromDb3,LocalDate.of(2025,8,14));
//        prenotazioniService.savePrenotazione(prenotazione3);

         postazioniService.findByTipoAndEdificioCitta(Tipo.SALA_RIUNIONI,"Napoli");






    }
}
