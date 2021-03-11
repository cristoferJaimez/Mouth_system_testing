/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.tipoUsuario;

/**
 *
 * @author Cristo
 */
public class RolDAOJPA extends GenericDAO<tipoUsuario, Integer>{
    
    public RolDAOJPA(Class<tipoUsuario> className) {
        super(className);
    }
    
}
