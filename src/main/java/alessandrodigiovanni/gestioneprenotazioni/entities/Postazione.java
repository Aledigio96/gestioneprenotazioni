package alessandrodigiovanni.gestioneprenotazioni.entities;

import alessandrodigiovanni.gestioneprenotazioni.enums.Tipo;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descrizione;
    @Enumerated(value = EnumType.STRING)
    private Tipo tipo;
    private int numMaxOccupanti;
    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, Tipo tipo, int numMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numMaxOccupanti = numMaxOccupanti;
        this.edificio = edificio;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public long getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNumMaxOccupanti() {
        return numMaxOccupanti;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setNumMaxOccupanti(int numMaxOccupanti) {
        this.numMaxOccupanti = numMaxOccupanti;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", numMaxOccupanti=" + numMaxOccupanti +
                ", edificio=" + edificio +
                ", prenotazioni=" + prenotazioni +
                '}';
    }
}
