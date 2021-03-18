package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.Tipo_Usuario;

/**
 *
 * @author Cristo
 */


public class RolDAOJPA extends GenericDAO<Tipo_Usuario, Integer> {


   
    
    public RolDAOJPA(Class<Tipo_Usuario> className) {
        super(className);
    }
    
}
