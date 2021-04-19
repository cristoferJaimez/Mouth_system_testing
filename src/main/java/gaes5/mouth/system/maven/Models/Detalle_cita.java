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
@Table(name = "detelle_cita")
public class Detalle_cita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_cita")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private Cita cita_id_cita;

    @ManyToOne
    @JoinColumn(name = "id_usuario_rol")
    private Usuario_rol usuario_rol_idusuario_rol;

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cita getCita_id_cita() {
        return cita_id_cita;
    }

    public void setCita_id_cita(Cita cita_id_cita) {
        this.cita_id_cita = cita_id_cita;
    }

    public Usuario_rol getUsuario_rol_idusuario_rol() {
        return usuario_rol_idusuario_rol;
    }

    public void setUsuario_rol_idusuario_rol(Usuario_rol usuario_rol_idusuario_rol) {
        this.usuario_rol_idusuario_rol = usuario_rol_idusuario_rol;
    }
//</editor-fold>

}
