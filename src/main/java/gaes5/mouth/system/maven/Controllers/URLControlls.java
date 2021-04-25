package gaes5.mouth.system.maven.Controllers;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@Named("URL")
@SessionScoped
public class URLControlls implements Serializable {

    public URLControlls() {
    }

    private String msm;

    public void dasboard() {
        msm = "";
        try {
//            FacesContext fc = FacesContext.getCurrentInstance();
//            fc.getExternalContext().redirect("Tablero/Dashboard.xhtml");
//            msm = "dasOk";
              msm = "okmsm";
        } catch (Exception e) {
        }
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

}
