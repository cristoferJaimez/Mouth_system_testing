package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ILoginDAO;
import gaes5.mouth.system.maven.DAO.Interface.IUsuario_rol;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Models.Usuario_rol;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class UsuarioServices {

    @EJB
    private ILoginDAO ilogindao;
    
    @EJB
    private IUsuario_rol iusuario_rol;

    //serviciso CRUD
    public Datos_Usuario crear(Datos_Usuario usuario) {
        return ilogindao.crear(usuario);
    }

    public List<Datos_Usuario> obtenerTodos() {
        return ilogindao.obtenerTodos();
    }

    public Datos_Usuario login(String email, String pw) {
        return ilogindao.signIn(email, pw);
    }

    
    public Datos_Usuario searchUser(Integer numDoc){
        return ilogindao.searchUser(numDoc);
    }
    
    public Datos_Usuario colsultExistence(String email, Integer numDoc ){
        return  ilogindao.colsultExistence(email, numDoc);
    }
    
    public  List<Usuario_rol> typeRols(Integer id){
        return  iusuario_rol.typeRol(id);
    }
    
    
    public  List<Usuario_rol>allRolsRegister(){
        return  iusuario_rol.allRolsRegister();
    }
  
    
//
    public  Datos_Usuario recordarPass(String emailUsu){
        return ilogindao.recordarPass(emailUsu);
    }
}
