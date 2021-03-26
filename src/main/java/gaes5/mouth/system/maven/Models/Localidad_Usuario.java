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
@Table(name = "localidad_usuario")
public class Localidad_Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localidad_usuario")
    private Integer id;

    @Column
    private String nom_localidad;

    @ManyToOne
    @JoinColumn(name = "id_ciudad_usuario")
    private Ciudad_Usuario ciudad_usuario_id_ciudad_usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_localidad() {
        return nom_localidad;
    }

    public void setNom_localidad(String nom_localidad) {
        this.nom_localidad = nom_localidad;
    }

    public Ciudad_Usuario getCiudad_usuario_id_ciudad_usuario() {
        return ciudad_usuario_id_ciudad_usuario;
    }

    public void setCiudad_usuario_id_ciudad_usuario(Ciudad_Usuario ciudad_usuario_id_ciudad_usuario) {
        this.ciudad_usuario_id_ciudad_usuario = ciudad_usuario_id_ciudad_usuario;
    }

}
