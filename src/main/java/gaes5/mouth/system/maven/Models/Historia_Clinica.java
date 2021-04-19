package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_inicio;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_fin;

    @Column
    private String descrpcion;

    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    
    public String getDescrpcion() {
        return descrpcion;
    }
    
    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }
//</editor-fold>

}
