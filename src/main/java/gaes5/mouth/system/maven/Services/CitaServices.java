package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ICitasDAO;
import gaes5.mouth.system.maven.Models.Cita;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class CitaServices {

    @EJB
    private ICitasDAO icitasDAO;

    //CRUD services
    public Cita crear(Cita cita) {
        return icitasDAO.crear(cita);
    }

}
