package it.prova.datamigrator.model.vecchio;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "anagrafica")
public class Anagrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private Date dataNascita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "datifiscali_id")
    private DatiFiscali datiFiscali;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "anagrafica")
    private Set<Sinistri> sinistri = new HashSet<Sinistri>(0);

    public Anagrafica() {
    }

    public Anagrafica(String nome, String cognome, Date dataNascita, DatiFiscali datiFiscali) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.datiFiscali = datiFiscali;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public DatiFiscali getDatiFiscali() {
        return datiFiscali;
    }

    public void setDatiFiscali(DatiFiscali datiFiscali) {
        this.datiFiscali = datiFiscali;
    }

    public Set<Sinistri> getSinistri() {
        return sinistri;
    }

    public void setSinistri(Set<Sinistri> sinistri) {
        this.sinistri = sinistri;
    }

    @Override
    public String toString() {
        return "Anagrafica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                '}';
    }
}
