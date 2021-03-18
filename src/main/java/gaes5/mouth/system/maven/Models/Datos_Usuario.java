package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "datos_usuario")
@NamedQueries(value = {
    @NamedQuery(name = "datos_usuario.getAllDatosUsuario", query = "SELECT obj FROM datos_usuario obj"),
    @NamedQuery(name = "datos_usuario.getEmail", query = "SELECT obj From datos_usuario obj WHERE obj.num_doc = :name")
})

public class Datos_Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column
    private Integer num_doc;

    @Column
    private String pri_nom;

    @Column
    private String seg_nom;

    @Column
    private String pri_ape;

    @Column
    private String seg_ape;

    @Column
    private String tipo_doc;

    @Column
    private Date fecha_nac;

    @Column
    private String nacionbalidad;

   
    @Column
    @ManyToOne
    private Tipo_Usuario id_tipo_usuario;

    // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(Integer num_doc) {
        this.num_doc = num_doc;
    }

    public String getPri_nom() {
        return pri_nom;
    }

    public void setPri_nom(String pri_nom) {
        this.pri_nom = pri_nom;
    }

    public String getSeg_nom() {
        return seg_nom;
    }

    public void setSeg_nom(String seg_nom) {
        this.seg_nom = seg_nom;
    }

    public String getPri_ape() {
        return pri_ape;
    }

    public void setPri_ape(String pri_ape) {
        this.pri_ape = pri_ape;
    }

    public String getSeg_ape() {
        return seg_ape;
    }

    public void setSeg_ape(String seg_ape) {
        this.seg_ape = seg_ape;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionbalidad() {
        return nacionbalidad;
    }

    public void setNacionbalidad(String nacionbalidad) {
        this.nacionbalidad = nacionbalidad;
    }

    public Tipo_Usuario getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(Tipo_Usuario id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    // </editor-fold>
}
