/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "usuario_rol")
public class Usuario_rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario_rol")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Datos_Usuario datos_usuario_id_usuario;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario")
    private Tipo_Usuario tipo_usuario_id_tipo_usuario;

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Datos_Usuario getDatos_usuario_id_usuario() {
        return datos_usuario_id_usuario;
    }

    public void setDatos_usuario_id_usuario(Datos_Usuario datos_usuario_id_usuario) {
        this.datos_usuario_id_usuario = datos_usuario_id_usuario;
    }

    public Tipo_Usuario getTipo_usuario_id_tipo_usuario() {
        return tipo_usuario_id_tipo_usuario;
    }

    public void setTipo_usuario_id_tipo_usuario(Tipo_Usuario tipo_usuario_id_tipo_usuario) {
        this.tipo_usuario_id_tipo_usuario = tipo_usuario_id_tipo_usuario;
    }
//</editor-fold>

}
