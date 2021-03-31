package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "inventerio")
public class Inventario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invantario")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "numDoc")
    private Datos_Usuario numDoc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Datos_Usuario getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Datos_Usuario numDoc) {
        this.numDoc = numDoc;
    }

}
