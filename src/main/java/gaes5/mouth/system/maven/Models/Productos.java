package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "productos")
public class Productos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productos")
    private Integer id;

    @Column
    private String nom_prod;

    @Column
    private String des_prod;

    @Temporal(TemporalType.DATE)
    @Column
    private Date fecha_ven;

    @Column
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "id_inventrio")
    private Inventario id_inventario;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria id_categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getDes_prod() {
        return des_prod;
    }

    public void setDes_prod(String des_prod) {
        this.des_prod = des_prod;
    }

    public Date getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(Date fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(Inventario id_inventario) {
        this.id_inventario = id_inventario;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }

}
