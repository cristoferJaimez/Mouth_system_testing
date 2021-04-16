package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.DAO.Interface.ILoginDAO;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.ejb.Stateless;


/*
    extiendo el genericDAO e implemento la interface para poder obtener todos los metodos disponibles
 */
/**
 *
 * @author cristo
 */
@Stateless
public class Datos_UsuarioDAO_JPA extends GenericDAO<Datos_Usuario, Integer> implements ILoginDAO {

    public Datos_UsuarioDAO_JPA() {
        super(Datos_Usuario.class);
    }

  
    

    @Override
    public void signIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
