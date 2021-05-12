package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Promociones;
import gaes5.mouth.system.maven.Services.PromocionesServices;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

/**
 *
 * @author cristo
 */
@Named("promocionesControllers")
@ViewScoped
public class PromocionesControllers implements Serializable {

    @EJB
    private PromocionesServices servicesPromociones;

    private Promociones promocion;
    private String msm;


    public PromocionesControllers() {
    }

    @PostConstruct
    public void init() {
        this.promocion = new Promociones();
    }

    public void crear() {
        msm = "";
        try {
            servicesPromociones.crear(promocion);
//            promocion = new Promociones();
            msm = "promoOk";
        } catch (Exception e) {
            msm = "promoBad";
            System.out.println("error al guardar promo : " + e.getMessage());
        }

    }

   


//<editor-fold defaultstate="collapsed" desc="SEtter an Getter">
    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

    public Promociones getPromocion() {
        return promocion;
    }

    public void setPromocion(Promociones promocion) {
        this.promocion = promocion;
    }
//</editor-fold>
}
