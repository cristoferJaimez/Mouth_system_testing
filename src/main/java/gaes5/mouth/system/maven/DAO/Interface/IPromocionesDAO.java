/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.DAO.Interface;

import gaes5.mouth.system.maven.DAO.DAO;
import gaes5.mouth.system.maven.Models.Promociones;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cristo
 */
@Local
public interface IPromocionesDAO extends DAO<Promociones, Integer> {

        List<Promociones>allPromos();

        
}
