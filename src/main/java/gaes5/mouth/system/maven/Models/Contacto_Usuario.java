package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table( name = "contacto_usuario")
public class Contacto_Usuario  implements Serializable{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_contacto_usuario")
    private Integer id;

    @Column
    private Integer telefono_fijo;

    @Column
    private Integer telefono_celular;

    @ManyToOne
    @JoinColumn(name = "num_doc") 
    private Datos_Usuario datos_usuario_num_doc;

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(Integer telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public Integer getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(Integer telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public Datos_Usuario getDatos_usuario_num_doc() {
        return datos_usuario_num_doc;
    }

    public void setDatos_usuario_num_doc(Datos_Usuario datos_usuario_num_doc) {
        this.datos_usuario_num_doc = datos_usuario_num_doc;
    }

}
