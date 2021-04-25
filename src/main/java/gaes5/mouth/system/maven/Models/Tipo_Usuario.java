package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

/**
 * @author Cristo
 */
@Entity
@Table(name = "tipo_usuario")
@NamedQueries( value = {
    
})
public class Tipo_Usuario implements Serializable {

    @Id
    @Column ( name = "id_tipo_usuario")
    @GeneratedValue( strategy =  GenerationType.IDENTITY )
    private Integer id;
    
    @Column( name = "cargo")
    private String  cargo;
    
    @Column( name = "descripcion")
    private String descripcion;

    
    
    
    
        // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    // </editor-fold>

   

    
    
    
}
