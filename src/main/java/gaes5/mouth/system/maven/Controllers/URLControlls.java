package gaes5.mouth.system.maven.Controllers;

import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@Named("URLControlls")
@SessionScoped
public class URLControlls implements Serializable {

    public URLControlls() {
    }

    private String msm;

    public void signOut() {
        msm = "";
        try {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.getExternalContext().redirect("../signIn.xhtml");
            msm = "credencialesBad";

        } catch (IOException e) {
            msm = "credencialesBad";
            System.out.println(e.getMessage());
        }
    }

    public void signOutUsers() {
        msm = "";
        try {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.getExternalContext().redirect("../mouth_system.xhtml");

            msm = "credencialesBad";

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

    public void pacientes() {
        msm = "";
        try {

            FacesContext fc = FacesContext.getCurrentInstance();
            fc.getExternalContext().redirect("Paciente/index.xhtml ");

            msm = "credencialesBad";

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

   

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

}
