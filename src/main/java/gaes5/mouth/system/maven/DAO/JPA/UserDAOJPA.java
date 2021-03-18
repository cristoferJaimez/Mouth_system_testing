//paquetes importados 
package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.DAO.Interface.UserDAO;
//librerias de java
import java.util.List;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author Cristofer Jaimez
 * 
 */

@Stateless  
public class UserDAOJPA extends GenericDAO<Datos_Usuario, Integer> implements UserDAO{
    
    //cosntructor
    public  UserDAOJPA(){
        super(Datos_Usuario.class);
    }

    @Override
    public List<Datos_Usuario> ObtenerUsuarios(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
