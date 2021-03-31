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
    @JoinColumn(name = "id")
    private Paciente id_paciente;

    @ManyToOne
    @JoinColumn(name = "id")
    private Medico id_medico;

    @ManyToOne
    @JoinColumn(name = "id")
    private Detalle_Fidelizacion id_detalle_fidelizcion;

    //setter and getter
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

    public Paciente getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Paciente id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Medico getId_medico() {
        return id_medico;
    }

    public void setId_medico(Medico id_medico) {
        this.id_medico = id_medico;
    }

    public Detalle_Fidelizacion getId_detalle_fidelizcion() {
        return id_detalle_fidelizcion;
    }

    public void setId_detalle_fidelizcion(Detalle_Fidelizacion id_detalle_fidelizcion) {
        this.id_detalle_fidelizcion = id_detalle_fidelizcion;
    }

}
