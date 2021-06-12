package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Setter;
import lombok.Builder;



/**
 *
 * @author cristo
 */
//@Builder
@Entity
@Table(name = "cita")
@NamedQueries(value = {
    @NamedQuery(name = "Cita.getAll", query = "SELECT obj FROM Cita obj ORDER BY obj.fecha_hora ASC"),
    @NamedQuery(name = "Cita.getAllCita", query = "SELECT obj FROM Cita obj ")
})
public class Cita implements Serializable {

    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Datos_Usuario id_usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora")
    private Date fecha_hora;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_agenda")
    private Agenda id_agenda;

    @ManyToOne
    @JoinColumn(name = "id_estado_cita")
    private Estado_Cita id_estado_cita;

    public Datos_Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Datos_Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Agenda getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(Agenda id_agenda) {
        this.id_agenda = id_agenda;
    }

    public Estado_Cita getId_estado_cita() {
        return id_estado_cita;
    }

    public void setId_estado_cita(Estado_Cita id_estado_cita) {
        this.id_estado_cita = id_estado_cita;
    }
//</editor-fold>
}
