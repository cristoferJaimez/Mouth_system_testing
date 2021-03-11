package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Cristo
 */
@Entity
@Table(name = "roles")
public class tipoUsuario implements Serializable {

    @Id
    @Column ( name = "id_tipo_usuario")
    @GeneratedValue( strategy =  GenerationType.IDENTITY )
    private Integer id;
    
    @Column
    private String  cargo;
    
    
        // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">

    public Integer getId_tipo_usuario() {
        return id;
    }

    public void setId_tipo_usuario(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    // </editor-fold>
}
