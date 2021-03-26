package gaes5.mouth.system.maven.Controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

//modelo
import gaes5.mouth.system.maven.Models.Datos_Usuario;

//DAO
import gaes5.mouth.system.maven.DAO.GenericDAO;

//util
import java.util.Date;
import java.util.Map;

/**
 *
 * @author cristo
 */

@RequestScoped
@Named("usuariosBean")
public class UsuariosBean {
    
    

    public String nuevo() {
        Datos_Usuario dateUser = new Datos_Usuario();
        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        sessionMap.put("usuario", dateUser);
        return "cliente creado";
    }

    public String guardar(Datos_Usuario usuario) {
        System.out.println("Boton guardar Activado");
        return "Hola desde guardar";
    }

}
