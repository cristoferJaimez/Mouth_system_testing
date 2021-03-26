package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "sign_In")
@NamedQueries(value = {
    @NamedQuery(name = "Usuarios_Login.getUser", query = "SELECT obj From  Usuarios_Login obj WHERE obj.email_usu=:email")
})
public class Usuarios_Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_signIn")
    private Integer id;

    @Column
    private String emailUsu;
    @Column
    private String contrasenna;

    @OneToOne
    @JoinColumn(name = "num_doc")
    private Datos_Usuario numDoc;

    // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public Datos_Usuario getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Datos_Usuario numDoc) {
        this.numDoc = numDoc;
    }

    // </editor-fold>
}
