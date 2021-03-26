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
@Table(name = "region")
public class Region implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_region")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_pais_usuario")
    private String pais_usuario_id_pais_usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais_usuario_id_pais_usuario() {
        return pais_usuario_id_pais_usuario;
    }

    public void setPais_usuario_id_pais_usuario(String pais_usuario_id_pais_usuario) {
        this.pais_usuario_id_pais_usuario = pais_usuario_id_pais_usuario;
    }

}
