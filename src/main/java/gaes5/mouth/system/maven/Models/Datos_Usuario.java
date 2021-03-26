package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    private Integer numDoc;

    @Column
    private String priNom;

    @Column
    private String segNom;

    @Column
    private String priApe;

    @Column
    private String segApe;

    @Column
    private String tipoDoc;

    @Temporal(TemporalType.DATE) // campo fecha
    @Column(name = "fecha_nac")
    private Date fechaNac;

    @Column
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario")
    private Tipo_Usuario idTipoUsuario;

    // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public String getPriNom() {
        return priNom;
    }

    public void setPriNom(String priNom) {
        this.priNom = priNom;
    }

    public String getSegNom() {
        return segNom;
    }

    public void setSegNom(String segNom) {
        this.segNom = segNom;
    }

    public String getPriApe() {
        return priApe;
    }

    public void setPriApe(String priApe) {
        this.priApe = priApe;
    }

    public String getSegApe() {
        return segApe;
    }

    public void setSegApe(String segApe) {
        this.segApe = segApe;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Tipo_Usuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Tipo_Usuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    // </editor-fold>
}
