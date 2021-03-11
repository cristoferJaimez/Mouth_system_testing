//paquetes importados 
package gaes5.mouth.system.maven.DAO.JPA;
import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.DAO.Interface.UserDAO;
//librerias de java
import java.util.List;
import gaes5.mouth.system.maven.Models.datos_usuario;
import javax.ejb.Stateless;

/**
 *
 * @author Cristofer Jaimez
 * 
 */

@Stateless
public class UserDAOJPA extends GenericDAO<datos_usuario, Integer> implements UserDAO{
    
    //cosntructor
    public  UserDAOJPA(){
        super(datos_usuario.class);
    }

    @Override
    public List<datos_usuario> ObtenerUsuarios(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
