package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Services.UsuarioServices;
import gaes5.mouth.system.maven.Mail.Email;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
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
@Named("ControllerRecoveryPass")
@ViewScoped      //
public class RecoveryPass implements Serializable {

    @EJB
    private UsuarioServices usuarioServices;

    private Datos_Usuario usuario;

    private String emailUsu;
    private String msm;

    public RecoveryPass() {

    }

    @PostConstruct
    public void init() {
        this.usuario = new Datos_Usuario();
    }

    public void recoveryPass() {
        msm = "";
        try {
            Datos_Usuario res = usuarioServices.recordarPass(emailUsu);
            if (res.getPw() != null && !res.getPriNom().isEmpty()) {
                Email.recuperarClaves(emailUsu, res.getPw(), res.getPriNom() + " " + res.getPriApe());
                msm = "okEmail";
            }

        } catch (Exception e) {
            System.out.println("error controlador recovery " + e.getMessage());
            msm = "badEmail";
        }

    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

}
