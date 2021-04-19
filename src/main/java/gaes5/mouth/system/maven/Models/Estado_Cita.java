package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "estado_cita")
public class Estado_Cita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_cita")
    private Integer id;

    @Column
    private String estado;

    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
//</editor-fold>

}
