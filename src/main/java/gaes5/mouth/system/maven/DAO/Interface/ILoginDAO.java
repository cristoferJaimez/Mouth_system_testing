/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.DAO.Interface;

import gaes5.mouth.system.maven.DAO.DAO;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.ejb.Local;

/*
    metodos puntuales para utilizar
 */
/**
 *
 * @author cristo
 */
@Local
public interface ILoginDAO extends DAO<Datos_Usuario, Integer> {

    //consultar usuario el signIn
    Datos_Usuario signIn(String email, String pw);

}
