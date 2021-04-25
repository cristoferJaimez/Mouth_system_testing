package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Models.Usuario_rol;
import gaes5.mouth.system.maven.Services.UsuarioServices;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
//import javax.faces.view.ViewScoped;
import javax.inject.Named;

/*
    cuerpo del controlador atributos + constructor  + setter and getter
 */
/**
 *
 * @author cristo
 */
//@ViewScoped         //se carga la instancia solo para la pagina qie invoca el controller
//@RequestScoped      //recibe metodo desde un formulario POST, GET, PUT, DELETE
@Named("signUpController")
@SessionScoped      //
public class SignUpController implements Serializable {

    @EJB
    private UsuarioServices usuarioServices;
    
    

    private Datos_Usuario usuario;
    private Datos_Usuario usuarios;
    private List<Usuario_rol> roles;

    private String msm;

    public SignUpController() {

    }

    @PostConstruct
    public void init() {
        this.usuario = new Datos_Usuario();
    }

    public void crear() {
        msm = "";
        try {
            usuarioServices.crear(usuario);
            usuario = new Datos_Usuario();
            msm = "msm2";
        } catch (Exception e) {
            msm = "msm3 ";
        }
    }

    public void userCheck() {
        msm = "";
        try {
            usuarios = usuarioServices.colsultExistence(usuario.getEmail(), usuario.getNumDoc());
            if (usuarios.getPriNom() != null) {
                try {
                    msm = "userOk";
                } catch (Exception e) {
                    msm = "msm2";
                }
            } else {
                msm = "msm3";
            }
        } catch (Exception e) {
            crear();
        }
    }

    public List<Usuario_rol> typeRols(Integer id) {

        try {
            roles = usuarioServices.typeRols(id);
            System.out.println( "roles ------------> "+roles);
            return roles;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Datos_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Datos_Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMsm() {
        return msm;
    }

    public List<Usuario_rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Usuario_rol> roles) {
        this.roles = roles;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }
//</editor-fold>
}
