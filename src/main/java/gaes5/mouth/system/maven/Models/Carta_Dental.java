package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "carta_dental")

public class Carta_Dental implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carta_dental")
    private Integer id;

    @Column
    private int diente;

    @Column
    private String ubicacion;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDiente() {
        return diente;
    }

    public void setDiente(int diente) {
        this.diente = diente;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
