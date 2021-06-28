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

    //iniciar session
    @Override
    public Datos_Usuario signIn(String email, String pw) {
        try {
            TypedQuery<Datos_Usuario> tq = em.createNamedQuery(className.getSimpleName() + ".Login", className);
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

    //buscar usuario por doumento
    @Override
    public Datos_Usuario searchUser(Integer numDoc) {
        try {
            TypedQuery<Datos_Usuario> tq = em.createNamedQuery(className.getSimpleName() + ".Search", className);
            tq.setParameter("dato", numDoc);
            List<Datos_Usuario> lista = tq.getResultList();
            if (lista.isEmpty()) {
                return null;
            } else {
                return lista.get(0);
            }
        } catch (Exception e) {
            return null;
        }
    }

    //consultar si usuario existe
    @Override
    public Datos_Usuario colsultExistence(String email, Integer numDoc) {
        try {
            TypedQuery<Datos_Usuario> tq = em.createNamedQuery("Datos_usuario.ConsultExistence", className);
            tq.setParameter("numDoc", numDoc);
            tq.setParameter("email", email);
            List<Datos_Usuario> lista = tq.getResultList();
            if (lista.isEmpty()) {
                System.out.println("lista vacia");
                return null;
            } else {
                return lista.get(0);
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

    @Override
    public Datos_Usuario recordarPass(String emailUsu) {
        try {
            TypedQuery<Datos_Usuario> tq = em.createNamedQuery(className.getSimpleName() + ".Recovery", className);
            tq.setParameter("email", emailUsu);
            return  (Datos_Usuario)  tq.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public Object eliminarCita() {
        return null;
    }
}
