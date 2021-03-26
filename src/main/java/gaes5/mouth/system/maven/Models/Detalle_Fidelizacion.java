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
    @JoinColumn(name = "id_paciente")
    private Paciente id_paciente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Paciente id_paciente) {
        this.id_paciente = id_paciente;
    }

}
