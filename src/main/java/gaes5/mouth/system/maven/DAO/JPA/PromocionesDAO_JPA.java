package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.DAO.Interface.IPromocionesDAO;
import gaes5.mouth.system.maven.Models.Promociones;
import java.util.Date;
import javax.persistence.Query;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class PromocionesDAO_JPA extends GenericDAO<Promociones, Integer> implements IPromocionesDAO {

    public PromocionesDAO_JPA() {
        super(Promociones.class);
    }

    @Override
    public List<Promociones> allPromos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearPromp( String titulo, String fecha_inicio, String fecha_fin, String descripcion) {

        try {

            Query query = em.createNativeQuery("INSERT INTO promociones(titulo,fecha_inicio,fecha_fin,descripcion) VALUES (?,?,?,?)");
            query.setParameter(2, titulo);
            query.setParameter(3, fecha_inicio);
            query.setParameter(4, fecha_fin);
            query.setParameter(5, descripcion);
            query.executeUpdate();

        } catch (Exception e) {
            System.out.println("error guardar cita: " + e.getLocalizedMessage());
        }

    }

}
