package it.prova.datamigrator.model.vecchio;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dati_fiscali")
public class DatiFiscali {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "codice_fiscale")
    private String codiceFiscale;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "datiFiscali")
    private Set<Anagrafica> anagrafica = new HashSet<Anagrafica>(0);

    public DatiFiscali() {
    }

    public DatiFiscali(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public DatiFiscali(Long id, String codiceFiscale) {
        this.id = id;
        this.codiceFiscale = codiceFiscale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Set<Anagrafica> getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Set<Anagrafica> anagrafica) {
        this.anagrafica = anagrafica;
    }

    @Override
    public String toString() {
        return "DatiFiscali{" +
                "id=" + id +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }
}
