/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.Usuarios_Login;

/**
 *
 * @author Cristo
 */
public class Usuarios_LoginDAOJPA extends GenericDAO<Usuarios_Login, Integer >{
    
    public Usuarios_LoginDAOJPA(Class<Usuarios_Login> className) {
        super(className);
    }
    
}
