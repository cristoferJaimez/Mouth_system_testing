package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Services.UsuarioServices;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@Named("listControlls")
@ViewScoped
public class ListasControlls implements Serializable {

    public ListasControlls() {
    }

    @EJB
    private UsuarioServices usuarioServicios;
    private Datos_Usuario usuario;

    //variables de entorno
    private String msm;

    @PostConstruct
    public void init() {
        this.usuario = new Datos_Usuario();
    }

    public List<Datos_Usuario> listarUsuarios() {
        msm = "";

        try {

            msm = "listaOk";
            return usuarioServicios.obtenerTodos();

        } catch (Exception e) {
            msm = "listaBad";
            return null;
        }

    }

    public void getIdUser(int id) {
        try {
            System.out.println("id : " + id);
//            usuarioServicios.obtenerId(id);
        } catch (Exception e) {
            System.out.println("no consulto datos");
        }
    }

    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public UsuarioServices getUsuarioServicios() {
        return usuarioServicios;
    }

    public void setUsuarioServicios(UsuarioServices usuarioServicios) {
        this.usuarioServicios = usuarioServicios;
    }

    public Datos_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Datos_Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }
//</editor-fold>
}
