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
@Table(name = "fidelizacion")
public class Fidelizacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fidelizacion")
    private Integer id;

    @Column
    private int puntaje;

    @Column
    private String Observacion;

    @ManyToOne
    @JoinColumn(name = "id_detalle_fidelizacion")
    private Detalle_Fidelizacion id_detalle_fidelizacion;

    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public Detalle_Fidelizacion getId_detalle_fidelizacion() {
        return id_detalle_fidelizacion;
    }

    public void setId_detalle_fidelizacion(Detalle_Fidelizacion id_detalle_fidelizacion) {
        this.id_detalle_fidelizacion = id_detalle_fidelizacion;
    }
//</editor-fold>

}
