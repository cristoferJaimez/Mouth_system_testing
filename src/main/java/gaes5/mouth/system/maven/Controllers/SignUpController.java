package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Services.UsuarioServices;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/*
    cuerpo del controlador atributos + constructor  + setter and getter
 */
/**
 *
 * @author cristo
 */
@Named("SignUpController")
@ViewScoped         //se carga la instancia solo para la pagina qie invoca el controller
//@RequestScoped      //recibe metodo desde un formulario POST, GET, PUT, DELETE
//@SessionScoped      //
public class SignUpController implements Serializable {

    //servicios
    @EJB
    private UsuarioServices usuarioServices;
    private  Datos_Usuario usuario;
     
    
    //metodo que se carga al iniciar el controlador
    @PostConstruct
    public void init(){
        this.usuario = new Datos_Usuario();
    }
  

  
    
   
    
    
    public Datos_Usuario getUser(){
        return usuario;
    }

    
    

    
}
