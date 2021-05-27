package it.prova.datamigrator.model.nuovo;


import javax.persistence.*;

@Entity
@Table(name = "not_processed")
public class NotProcessed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "codice_fiscale")
    private String codiceFiscale;

    @Column(name = "old_id")
    private Long oldId;

    public NotProcessed() {
    }

    public NotProcessed(Long id, String codiceFiscale, Long oldId) {
        this.id = id;
        this.codiceFiscale = codiceFiscale;
        this.oldId = oldId;
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

    public Long getOldId() {
        return oldId;
    }

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }

    @Override
    public String toString() {
        return "NotProcessed{" +
                "id=" + id +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", oldId=" + oldId +
                '}';
    }
}
