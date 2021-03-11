package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Cristo
 */

@Entity
@Table( name = "sign_In")
@NamedQueries( value = {
    @NamedQuery(name = "Usuarios_Login.getUser", query = "SELECT obj From  Usuarios_Login obj WHERE obj.email_usu=:email")
})
public class Usuarios_Login implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_signIn")
    private Integer id;
    
    @Column
    private String email_usu;
    @Column
    private String Contrasenna;
    @Column
    private datos_usuario num_doc;

    
    
    // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">
    public String getEmail_usu() {
        return email_usu;
    }

    public void setEmail_usu(String email_usu) {
        this.email_usu = email_usu;
    }

    public String getContrasenna() {
        return Contrasenna;
    }

    public void setContrasenna(String Contrasenna) {
        this.Contrasenna = Contrasenna;
    }

    public datos_usuario getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(datos_usuario num_doc) {
        this.num_doc = num_doc;
    }
    
        // </editor-fold>


}
