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
@Table(name = "direccion_usuario")
public class Direccion_Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion_usurio")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_pais_usuario")
    private Pais_Usuario id_pais_usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_ciudad_usuario")
    private Pais_Usuario id_ciudad_usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_localidad_usuario")
    private Localidad_Usuario id_localidad_usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_region_usuario")
    private Region region_id_region;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Datos_Usuario datos_usuario_id_usuario;

    //setter and getter
//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Datos_Usuario getDatos_usuario_id_usuario() {
        return datos_usuario_id_usuario;
    }
    
    public void setDatos_usuario_id_usuario(Datos_Usuario datos_usuario_id_usuario) {
        this.datos_usuario_id_usuario = datos_usuario_id_usuario;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Pais_Usuario getId_pais_usuario() {
        return id_pais_usuario;
    }
    
    public void setId_pais_usuario(Pais_Usuario id_pais_usuario) {
        this.id_pais_usuario = id_pais_usuario;
    }
    
    public Pais_Usuario getId_ciudad_usuario() {
        return id_ciudad_usuario;
    }
    
    public void setId_ciudad_usuario(Pais_Usuario id_ciudad_usuario) {
        this.id_ciudad_usuario = id_ciudad_usuario;
    }
    
    public Localidad_Usuario getId_localidad_usuario() {
        return id_localidad_usuario;
    }
    
    public void setId_localidad_usuario(Localidad_Usuario id_localidad_usuario) {
        this.id_localidad_usuario = id_localidad_usuario;
    }
    
    public Region getRegion_id_region() {
        return region_id_region;
    }
    
    public void setRegion_id_region(Region region_id_region) {
        this.region_id_region = region_id_region;
    }
//</editor-fold>
}
