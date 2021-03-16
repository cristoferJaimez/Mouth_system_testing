package gaes5.mouth.system.maven.DAO.Interface;

import java.util.List;
import gaes5.mouth.system.maven.DAO.DAO;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.ejb.Local;

/**
 *
 * @author Cristo
 */

@Local
public interface UserDAO  extends DAO<Datos_Usuario, Integer>{
    //mostrar usuarios por nombre
    List<Datos_Usuario>ObtenerUsuarios(String name);    
    
}
