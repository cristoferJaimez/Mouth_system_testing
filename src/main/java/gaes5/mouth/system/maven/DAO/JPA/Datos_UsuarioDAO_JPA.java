package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.DAO.Interface.ILoginDAO;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;


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
    public Datos_Usuario signIn(String email, String pw) {
        try {
            TypedQuery<Datos_Usuario> tq = em.createNamedQuery("Datos_Usuario.Login", className);
            tq.setParameter("correo", email);
            tq.setParameter("pw", pw);
            List<Datos_Usuario> listaUsuarios = tq.getResultList();

            if (listaUsuarios.isEmpty()) {
                return null;
            } else {
                return listaUsuarios.get(0);
            }
        } catch (Exception e) {
            return null;
        }
    }

}
