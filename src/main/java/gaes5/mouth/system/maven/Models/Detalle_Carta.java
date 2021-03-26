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
@Table(name = "detalle_carta")
public class Detalle_Carta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_carta")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_carta_dental")
    private Carta_Dental carta_dental_id_carta_dental;

    @ManyToOne
    @JoinColumn(name = "id_tratamiento")
    private Tratamiento id_tratamiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Carta_Dental getCarta_dental_id_carta_dental() {
        return carta_dental_id_carta_dental;
    }

    public void setCarta_dental_id_carta_dental(Carta_Dental carta_dental_id_carta_dental) {
        this.carta_dental_id_carta_dental = carta_dental_id_carta_dental;
    }

    public Tratamiento getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(Tratamiento id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

}
