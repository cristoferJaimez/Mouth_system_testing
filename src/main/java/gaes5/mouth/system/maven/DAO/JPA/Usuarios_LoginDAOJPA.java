package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.Usuarios_Login;

/**
 *
 * @author Cristo
 */

public class Usuarios_LoginDAOJPA extends GenericDAO<Usuarios_Login, Integer >{
    
    public Usuarios_LoginDAOJPA(Class<Usuarios_Login> className) {
        super(className);
    }
    
}
