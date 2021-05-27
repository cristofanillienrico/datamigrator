package it.prova.datamigrator.model.vecchio;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sinistri")
public class Sinistri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "luogo")
    private String luogo;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "data")
    private Date data;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "anagrafica_id")
    private Anagrafica anagrafica;

    public Sinistri() {
    }

    public Sinistri(Long id, String luogo, String tipo, Date data, Anagrafica anagrafica) {
        this.id = id;
        this.luogo = luogo;
        this.tipo = tipo;
        this.data = data;
        this.anagrafica = anagrafica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    @Override
    public String toString() {
        return "Sinistri{" +
                "id=" + id +
                ", luogo='" + luogo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", data=" + data +
                '}';
    }
}
