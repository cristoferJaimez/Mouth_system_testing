package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "tratamiento")
public class Tratamiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tratamiento")
    private Integer id;

    @Column
    private String nom_tratamiento;

    @Column
    private String tipo_tratamiento;

    @Column
    private String obser_trata;

    @Column
    private Integer des_tratamiento;

    @Column
    private String reg_fotografico;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio")
    private Date fecha_inicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @ManyToOne
    @JoinColumn(name = "id_detalle_historia")
    private Detalle_Historia detalle_historia_id_detalle_historia;

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_tratamiento() {
        return nom_tratamiento;
    }

    public void setNom_tratamiento(String nom_tratamiento) {
        this.nom_tratamiento = nom_tratamiento;
    }

    public String getTipo_tratamiento() {
        return tipo_tratamiento;
    }

    public void setTipo_tratamiento(String tipo_tratamiento) {
        this.tipo_tratamiento = tipo_tratamiento;
    }

    public String getObser_trata() {
        return obser_trata;
    }

    public void setObser_trata(String obser_trata) {
        this.obser_trata = obser_trata;
    }

    public Integer getDes_tratamiento() {
        return des_tratamiento;
    }

    public void setDes_tratamiento(Integer des_tratamiento) {
        this.des_tratamiento = des_tratamiento;
    }

    public String getReg_fotografico() {
        return reg_fotografico;
    }

    public void setReg_fotografico(String reg_fotografico) {
        this.reg_fotografico = reg_fotografico;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Detalle_Historia getDetalle_historia_id_detalle_historia() {
        return detalle_historia_id_detalle_historia;
    }

    public void setDetalle_historia_id_detalle_historia(Detalle_Historia detalle_historia_id_detalle_historia) {
        this.detalle_historia_id_detalle_historia = detalle_historia_id_detalle_historia;
    }

//</editor-fold>
}
