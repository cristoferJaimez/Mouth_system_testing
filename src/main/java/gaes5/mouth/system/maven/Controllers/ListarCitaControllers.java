package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.Services.CitaServices;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * @author cristo
 */
@Named("ListarCitaControllers")
@ViewScoped
public class ListarCitaControllers implements Serializable {

    private Cita cita;
    private String msm;

    public ListarCitaControllers() {
    }

    @EJB
    private CitaServices citaServices;

    /*
    @PostConstruct
    public void init() {
        this.cita = new Cita();

    }
*/
    public List<Cita> todasCitas() {

        msm = "";
        try {

            if (citaServices.todasCitas().isEmpty()) {
                msm = "no";
                return null;
            } else {
                msm = "no";
                return citaServices.todasCitas();
            }
        } catch (Exception e) {
            msm = "no";
            return null;
        }

    }

    public void existeCita(String id) {
        try {
            System.out.println("citasssss--------------------------->");
            citaServices.existeCit(id);
        } catch (Exception e) {
        }
    }

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
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
