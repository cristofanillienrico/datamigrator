package it.prova.datamigrator.model.nuovo;


import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Qualifier("nuovodb")
@Entity()
@Table(name = "assicurato")
public class Assicurato {


    @Id
    @Column(name = "codice_fiscale")
    private String codiceFiscale;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private Date dataNascita;

    @Column(name = "numero_sinistri")
    private Integer numeroSinistri;


    public Assicurato() {
    }

    public Assicurato(String codiceFiscale, String nome, String cognome, Date dataNascita, Integer numeroSinistri) {
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroSinistri = numeroSinistri;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
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

    public Integer getNumeroSinistri() {
        return numeroSinistri;
    }

    public void setNumeroSinistri(Integer numeroSinistri) {
        this.numeroSinistri = numeroSinistri;
    }

    @Override
    public String toString() {
        return "Assicurato{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", numeroSinistri=" + numeroSinistri +
                '}';
    }
}
