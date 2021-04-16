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
@Table(name = "ciudad_usuario")
public class Ciudad_Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad_usuario")
    private Integer id;

    @Column
    private String nom_ciudad_usu;

    @ManyToOne
    @JoinColumn(name = "id_region")
    private Region region_id_region;
    
//<editor-fold defaultstate="collapsed" desc="Setter and GEtter">
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNom_ciudad_usu() {
        return nom_ciudad_usu;
    }
    
    public void setNom_ciudad_usu(String nom_ciudad_usu) {
        this.nom_ciudad_usu = nom_ciudad_usu;
    }
    
    public Region getRegion_id_region() {
        return region_id_region;
    }
    
    public void setRegion_id_region(Region region_id_region) {
        this.region_id_region = region_id_region;
    }
//</editor-fold>

}
