/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.Services.CitaServices;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@Named("citasControllers")
@SessionScoped
public class CitasControllers implements Serializable {

    @EJB
    private CitaServices citaServices;
    private Cita cita;

    private String msm = "";

    public CitasControllers() {
    }

    @PostConstruct
    public void init() {
        this.cita = new Cita();
    }

    public void crear() {
        msm = "";

        try {
            citaServices.crear(cita);
            cita = new Cita();
            msm = "citaOk";
        } catch (Exception e) {
            msm = "citaBad";
        }

    }
    
//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    
    public CitaServices getCitaServices() {
        return citaServices;
    }
    
    public void setCitaServices(CitaServices citaServices) {
        this.citaServices = citaServices;
    }
    
    public Cita getCita() {
        return cita;
    }
    
    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    public String getMsm() {
        return msm;
    }
    
    public void setMsm(String msm) {
        this.msm = msm;
    }
    
    
//</editor-fold>
 
    
}
