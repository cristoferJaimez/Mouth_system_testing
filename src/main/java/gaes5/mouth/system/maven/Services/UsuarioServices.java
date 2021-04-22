package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ILoginDAO;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
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

    //serviciso CRUD
    public Datos_Usuario crear(Datos_Usuario usuario) {
        return ilogindao.crear(usuario);
    }

    public List<Datos_Usuario> obtenerTodos() {
        return ilogindao.obtenerTodos();
    }

    public Datos_Usuario obtenerId(Integer id) {
        return ilogindao.obtenerId(id);
    }

    public void eliminar(Integer id) {
        ilogindao.eliminar(id);
    }

    public void actualizar(Datos_Usuario usuario) {
        ilogindao.actualizar(usuario);
    }

    public Datos_Usuario login(String email, String pw) {
        return ilogindao.signIn(email, pw);
    }

    
    public Datos_Usuario searchUser(Integer numDoc){
        return ilogindao.searchUser(numDoc);
    }
}
