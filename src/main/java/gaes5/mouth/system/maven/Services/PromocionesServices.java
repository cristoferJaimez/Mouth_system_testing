package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.IPromocionesDAO;
import gaes5.mouth.system.maven.Models.Promociones;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class PromocionesServices {

    @EJB
    private IPromocionesDAO ipromocionesDao;

    public Promociones crear(Promociones promo) {
        return  ipromocionesDao.crear(promo);
    }

    
   
}
