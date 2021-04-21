/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.Calendar;
import javax.inject.Named;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import org.primefaces.context.RequestContext;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author cristo
 */
@ViewScoped
@Named("calendar")
public class Calendar implements Serializable{
    
     private String center_mapa = "-12.0459686,-77.0327614";
    private Date fecha;
    private String usuario = "";
    private String clave = "";
    private Boolean opcion = false;
    private String f_seleccionada = "";

    public Calendar() {
        
        fecha = new Date();
    }

    public String getF_seleccionada() {
        return f_seleccionada;
    }

    public void setF_seleccionada(String f_seleccionada) {
        this.f_seleccionada = f_seleccionada;
    }

  

    public Boolean getOpcion() {
        return opcion;
    }

    public void setOpcion(Boolean opcion) {
        this.opcion = opcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   
    public String getCenter_mapa() {
        return center_mapa;
    }

    public void setCenter_mapa(String center_mapa) {
        this.center_mapa = center_mapa;
    }

    public MapModel getSimpleModel() {
        DefaultMapModel simpleModel = new DefaultMapModel();

        //Coordenadas 
        LatLng coord1 = new LatLng(-12.0450236, -77.0309484);
        LatLng coord2 = new LatLng(-12.0461097, -77.0318492);
        LatLng coord3 = new LatLng(-12.0455507, -77.0314336);
        LatLng coord4 = new LatLng(-12.0452037, -77.0322574);

        //Marcadores
        simpleModel.addOverlay(new Marker(coord1, "Palacio Arzobispal de Lima"));
        simpleModel.addOverlay(new Marker(coord2, "Rocky's"));
        simpleModel.addOverlay(new Marker(coord3, "Restaurante el Diez"));
        simpleModel.addOverlay(new Marker(coord4, "Municipalidad Metropolitana de Lima"));
        return simpleModel;
    }

   
    public void mostrar(int op) {

        if (op == 1) {
            fecha = new Date();
            RequestContext.getCurrentInstance().update("form:hora");
            RequestContext.getCurrentInstance().execute("PF('notificacion').show();");
        } else {
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('notificacion').hide();");
        }
    }

    public void agregarMensaje() {
        String summary = opcion ? "Activo" : "Desactivo";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }

    

    public void actualizar_fecha(SelectEvent event) {
        SimpleDateFormat fecha1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
        StringBuilder cadena_fecha1_11 = new StringBuilder(fecha1.format(event.getObject()));
        f_seleccionada = cadena_fecha1_11.toString();
        
    }
    
}
