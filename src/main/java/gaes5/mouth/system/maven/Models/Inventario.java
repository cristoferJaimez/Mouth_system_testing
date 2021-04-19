package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "inventerio")
public class Inventario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invantario")
    private Integer id_inventario;
    
    @ManyToOne
    @JoinColumn(name = "idusuario_rol")
    private Datos_Usuario usuario_rol_idusuario_rol;

    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId_inventario() {
        return id_inventario;
    }
    
    public void setId_inventario(Integer id_inventario) {
        this.id_inventario = id_inventario;
    }
    
    public Datos_Usuario getUsuario_rol_idusuario_rol() {
        return usuario_rol_idusuario_rol;
    }
    
    public void setUsuario_rol_idusuario_rol(Datos_Usuario usuario_rol_idusuario_rol) {
        this.usuario_rol_idusuario_rol = usuario_rol_idusuario_rol;
    }

//</editor-fold>
}
