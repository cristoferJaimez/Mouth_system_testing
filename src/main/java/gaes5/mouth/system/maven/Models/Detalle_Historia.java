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
@Table(name = "detalle_historia")
public class Detalle_Historia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_historia")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_historia_clinica",insertable = false, updatable = false )
    private Historia_Clinica historia_clinica_id_historia_clinica;

    @ManyToOne
    @JoinColumn(name = "id_historia_clinica", insertable = false, updatable = false)
    private Usuario_rol usuario_rol_idusuario_rol;

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Historia_Clinica getHistoria_clinica_id_historia_clinica1() {
        return historia_clinica_id_historia_clinica;
    }
    
    public void setHistoria_clinica_id_historia_clinica1(Historia_Clinica historia_clinica_id_historia_clinica1) {
        this.historia_clinica_id_historia_clinica = historia_clinica_id_historia_clinica1;
    }
    
    public Usuario_rol getUsuario_rol_idusuario_rol() {
        return usuario_rol_idusuario_rol;
    }
    
    public void setUsuario_rol_idusuario_rol(Usuario_rol usuario_rol_idusuario_rol) {
        this.usuario_rol_idusuario_rol = usuario_rol_idusuario_rol;
    }
//</editor-fold>
}
