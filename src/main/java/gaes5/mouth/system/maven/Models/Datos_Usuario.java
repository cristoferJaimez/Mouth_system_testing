package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
    @NamedQuery(name = "Datos_Usuario.Login", query = "SELECT obj From Datos_Usuario obj WHERE obj.email = :correo  and   obj.pw = :pw"),
    @NamedQuery(name=  "Datos_usuario.ConsultExistence" , query = "SELECT obj FROM Datos_Usuario obj WHERE obj.numDoc = :numDoc OR obj.email = :email"),
    @NamedQuery(name = "Datos_Usuario.Search", query = "SELECT obj FROM Datos_Usuario obj WHERE obj.numDoc = :dato")
})  

public class Datos_Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "num_doc")
    private Integer numDoc;

    @Column(name = "pri_nom")
    private String priNom;

    @Column(name = "seg_nom")
    private String segNom;

    @Column(name = "pri_ape")
    private String priApe;

    @Column(name = "seg_ape")
    private String segApe;

    @Column(name = "tipoDoc")
    private String tipoDoc;

    @Temporal(TemporalType.DATE) // campo fecha
    @Column(name = "fecha_nac")
    private Date fechaNac;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "email")
    private String email;

    @Column(name = "pw")
    private String pw;

    @Column(name = "movil")
    private BigInteger movil;

    @Column(name = "telefono")
    private BigInteger telefono;

    
    
    
    
//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public BigInteger getMovil() {
        return movil;
    }

    public void setMovil(BigInteger movil) {
        this.movil = movil;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

//</editor-fold>
}
