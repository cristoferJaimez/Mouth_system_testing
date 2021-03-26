package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "historia_clinica")
public class Historia_Clinica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historia_clinica")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_paciente")
    private Paciente id_paciente;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio")
    private Date fecha_inicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin")
    private Date fecha_fin;

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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

}
