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
    
    private String titulo;
    private String fecha_i;
    private String fecha_f;
    private String des;
    
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
//
            servicesPromociones.crearPromo(titulo,fecha_i,fecha_f,des);
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

    //<editor-fold defaultstate="collapsed" desc="SEtter an Getter variables locales">
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getFecha_i() {
        return fecha_i;
    }
    
    public void setFecha_i(String fecha_i) {
        this.fecha_i = fecha_i;
    }
    
    public String getFecha_f() {
        return fecha_f;
    }
    
    public void setFecha_f(String fecha_f) {
        this.fecha_f = fecha_f;
    }
    
    public String getDes() {
        return des;
    }
    
    public void setDes(String des) {
        this.des = des;
    }
//</editor-fold>

}
