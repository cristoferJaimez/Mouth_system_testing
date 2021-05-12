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

  

}
