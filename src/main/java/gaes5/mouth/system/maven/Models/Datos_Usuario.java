package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Datos_Usuario.getAll", query = "SELECT obj FROM Datos_Usuario obj ")

})

public class Datos_Usuario implements Serializable {

    @Id
    @Column(name = "num_doc")
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

    @Column
    private String email;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario")
    private Tipo_Usuario idTipoUsuario;

    /*@Column
    private Boolean completo_registro;

    @Column
    private Boolean borrado_logico;
    */
    
//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tipo_Usuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Tipo_Usuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    /*
    public Boolean getCompleto_registro() {
        return completo_registro;
    }

    public void setCompleto_registro(Boolean completo_registro) {
        this.completo_registro = completo_registro;
    }

    public Boolean getBorrado_logico() {
        return borrado_logico;
    }

    public void setBorrado_logico(Boolean borrado_logico) {
        this.borrado_logico = borrado_logico;
    }
  */
//</editor-fold>
}
