package alessandrodigiovanni.gestioneprenotazioni.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "edifici")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String indirizzo;
    private String città;
    @OneToMany(mappedBy = "edifici",cascade = CascadeType.ALL)
    private List<Postazione> postazioni;

    public Edificio(String nome, String indirizzo, String città, List<Postazione> postazioni) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.città = città;
        this.postazioni = postazioni;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCittà() {
        return città;
    }

    public List<Postazione> getPostazioni() {
        return postazioni;
    }

    public void setPostazioni(List<Postazione> postazioni) {
        this.postazioni = postazioni;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", città='" + città + '\'' +
                ", postazioni=" + postazioni +
                '}';
    }
}
