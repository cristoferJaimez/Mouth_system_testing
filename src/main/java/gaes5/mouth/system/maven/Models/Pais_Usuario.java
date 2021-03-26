package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "pais_usuario")
public class Pais_Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais_usuario")
    private Integer id;

    @Column
    private String nom_pais_usu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_pais_usu() {
        return nom_pais_usu;
    }

    public void setNom_pais_usu(String nom_pais_usu) {
        this.nom_pais_usu = nom_pais_usu;
    }

}
