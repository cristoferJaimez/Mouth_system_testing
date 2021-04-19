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
@Table(name = "detalle_fedilizacion")
public class Detalle_Fidelizacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_fidelizacion")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idusuario_rol")
    private Usuario_rol Usuario_rol_idusuario_rol;
    

    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Usuario_rol getUsuario_rol_idusuario_rol() {
        return Usuario_rol_idusuario_rol;
    }
    
    public void setUsuario_rol_idusuario_rol(Usuario_rol Usuario_rol_idusuario_rol) {
        this.Usuario_rol_idusuario_rol = Usuario_rol_idusuario_rol;
    }
//</editor-fold>

}
