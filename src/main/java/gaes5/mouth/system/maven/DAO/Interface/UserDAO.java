package gaes5.mouth.system.maven.DAO.Interface;

import java.util.List;
import gaes5.mouth.system.maven.DAO.DAO;
import gaes5.mouth.system.maven.Models.datos_usuario;
import javax.ejb.Local;

/**
 *
 * @author Cristo
 */

@Local
public interface UserDAO  extends DAO<datos_usuario, Integer>{
    //mostrar usuarios por nombre
    List<datos_usuario>ObtenerUsuarios(String name);    
    
}
