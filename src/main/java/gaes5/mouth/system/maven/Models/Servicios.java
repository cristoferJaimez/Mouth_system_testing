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
@Table(name = "servicios")
public class Servicios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ventas")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_catalogo_servicios")
    private Catalogo_Servicios id_catalogo;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Catalogo_Servicios id_paciente;

    //setter and getter
    
    
    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Catalogo_Servicios getId_catalogo() {
        return id_catalogo;
    }
    
    public void setId_catalogo(Catalogo_Servicios id_catalogo) {
        this.id_catalogo = id_catalogo;
    }
    
    public Catalogo_Servicios getId_paciente() {
        return id_paciente;
    }
    
    public void setId_paciente(Catalogo_Servicios id_paciente) {
        this.id_paciente = id_paciente;
    }
//</editor-fold>

}
