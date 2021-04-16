package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "paciente")
public class Paciente implements Serializable{
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id_paciente")
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "num_doc")
    private Datos_Usuario dato_usuario_num_doc;

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Datos_Usuario getDato_usuario_num_doc() {
        return dato_usuario_num_doc;
    }
    
    public void setDato_usuario_num_doc(Datos_Usuario dato_usuario_num_doc) {
        this.dato_usuario_num_doc = dato_usuario_num_doc;
    }
//</editor-fold>
   
    
    
    
}
