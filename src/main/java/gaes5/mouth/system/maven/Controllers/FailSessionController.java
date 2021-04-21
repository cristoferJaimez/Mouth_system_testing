/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.Controllers;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@ViewScoped
@Named("failSessionController")
public class FailSessionController implements Serializable {

    public FailSessionController() {
    }

    private String msm = "";

    public void Redirecting(){

        msm = "";

        try {
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.getExternalContext().redirect("../signIn.xhtml");
            msm = "redirecting";
        } catch (IOException e) {
             msm = "redirecting";
        }

    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

}
