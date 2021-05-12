/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.Services.CitaServices;
import java.io.Serializable;
import java.util.List;
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

    //VARIABLES
    private String id;
    private String descripcion;
    private String fecha;
    private int agenda = 1;
    private int estado_cita = 1;

    public CitasControllers() {

    }

    @PostConstruct
    public void init() {
        this.cita = new Cita();
    }

    public void crear() {
        msm = "";
        try {
            
            citaServices.guardarCita(id, descripcion, fecha);
            cita = new Cita();
            msm = "citaOk";
        } catch (Exception e) {
            msm = "citaBad";
        }

    }
    
    
    

    public List<Cita> todasCitas() {
        return citaServices.todasCitas();
    }
   
   
    public void ver(){
        System.out.println("hola");
    }

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
//<editor-fold defaultstate="collapsed" desc="comment">
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAgenda() {
        return agenda;
    }

    public void setAgenda(int agenda) {
        this.agenda = agenda;
    }

    public int getEstado_cita() {
        return estado_cita;
    }

    public void setEstado_cita(int estado_cita) {
        this.estado_cita = estado_cita;
    }
//</editor-fold>

}
