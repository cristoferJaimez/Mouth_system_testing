package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.DAO.Interface.ICitasDAO;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class CitaDAO_JPA extends GenericDAO<Cita, Integer> implements ICitasDAO {
    
    public CitaDAO_JPA() {
        super(Cita.class);
    }
    
}
