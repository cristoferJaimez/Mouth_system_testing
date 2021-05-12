package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.DAO.Interface.ICitasDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author cristo
 */
@Stateless
public class CitaDAO_JPA extends GenericDAO<Cita, Integer> implements ICitasDAO {

    public CitaDAO_JPA() {
        super(Cita.class);
    }

    @Override
    public void nuevaCita( String idU, String des, String fecha) {

        try {

            Query query = em.createNativeQuery("INSERT INTO cita(id_usuario,fecha_hora,descripcion,id_agenda,id_estado_cita) VALUES (?,?,?,?,?)");
            query.setParameter(1, idU);
            query.setParameter(2, fecha);
            query.setParameter(3, des);
            query.setParameter(4, "1");
            query.setParameter(5, "1");
            query.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error guardar cita: " + e.getLocalizedMessage() );
        }

    }

    @Override
    public List<Cita> obtenerID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
