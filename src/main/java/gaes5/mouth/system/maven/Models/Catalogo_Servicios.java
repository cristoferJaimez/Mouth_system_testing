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
@Table(name = "catalogo_servicios")
public class Catalogo_Servicios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo_servicios")
    private Integer id;

    @Column
    private String nom_servicios;

    @Column
    private String descripcion;

    @Column
    private Integer decuento_servicio;

    @Column
    private Integer costo_servicio;

    @Column
    private String img_servicio;

    // <editor-fold defaultstate="collapsed" desc="Metodo SETTER Y GETTER. Click on the + sign on the left to edit the code.">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_servicios() {
        return nom_servicios;
    }

    public void setNom_servicios(String nom_servicios) {
        this.nom_servicios = nom_servicios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDecuento_servicio() {
        return decuento_servicio;
    }

    public void setDecuento_servicio(Integer decuento_servicio) {
        this.decuento_servicio = decuento_servicio;
    }

    public Integer getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Integer costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public String getImg_servicio() {
        return img_servicio;
    }

    public void setImg_servicio(String img_servicio) {
        this.img_servicio = img_servicio;
    }

    // </editor-fold>
}
