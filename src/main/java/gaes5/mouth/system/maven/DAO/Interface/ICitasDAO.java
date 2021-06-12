package gaes5.mouth.system.maven.DAO.Interface;

import gaes5.mouth.system.maven.DAO.DAO;
import gaes5.mouth.system.maven.Models.Cita;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cristo
 */
@Local
public interface ICitasDAO extends DAO<Cita, Integer> {
    
    void nuevaCita( String idU, String des, String fecha);
    
    void ActualizarCita( int idE, int idC, String des, String fecha);
//

    public List<Cita> obtenerID( int id);
    
    public List<Cita> newList();
    
    public boolean compararFechas(String fecha);

    
    public List<Cita> existeCit(String id);
}
