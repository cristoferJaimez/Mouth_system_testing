package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.Services.CitaServices;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import java.time.format.DateTimeFormatter;

/**
 * @author cristo
 */
@Named("citasControllers")
@RequestScoped
public class CitasControllers implements Serializable {

    @EJB
    private CitaServices citaServices;

    private Cita cita;
    private String msm = "";

    //VARIABLES
    private String id;
    private int idC;
    private int idE;

    DateTimeFormatter tiempo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private String descripcion;
    private String fecha;
    private int agenda = 1;
    private int estado_cita = 1;

    public CitasControllers() {
    }

    /*
    @PostConstruct
    public void init() {
        this.cita = new Cita();

    }
*/

    public void crear() {

        msm = "";
        try {
            citaServices.guardarCita(id, descripcion, fecha);
            msm = "citaOk";
        } catch (Exception e) {
            msm = "citaBad";
        }

    }

    public void actualizar() {
        try {

            try {

                citaServices.actualizarCita(idC, idE, descripcion, fecha);
                //cita = new Cita();
                msm = "actOk";

            } catch (Exception e) {
                msm = "actBad";
            }

        } catch (Exception e) {
            msm = "actBad";
        }

    }

    public void eliminar(String id) {
        msm = "";
        try {
            msm = "okDel";
            citaServices.eliminarCita(id);
        } catch (Exception e) {
            msm = "badDel";
        }
        msm = "queryDabDel";
    }

    public boolean compararFEcha() {
        try {
          
            if (citaServices.compararFecha(fecha) == !true) {
                msm = "fechaBad";
                System.out.println("fecha--> " + fecha);
                return false;
            } else {
                msm = "fechaOK";
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error al comparar fechas controlador: " + e.getMessage());
            msm = "fachaCath";
            return false;
        }
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

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }
}
