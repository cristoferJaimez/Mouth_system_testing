package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ILoginDAO;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class UsuarioServices {
    
    
    private ILoginDAO ilogindao;
    
    public void create( Datos_Usuario usuario){
    }  
}
