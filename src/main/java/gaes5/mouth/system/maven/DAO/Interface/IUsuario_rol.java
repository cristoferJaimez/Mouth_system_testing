/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.DAO.Interface;

import gaes5.mouth.system.maven.DAO.DAO;
import gaes5.mouth.system.maven.Models.Usuario_rol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cristo
 */
@Local
public interface IUsuario_rol extends DAO<Usuario_rol, Integer >{
       
    
    List<Usuario_rol> typeRol(Integer id);
    
    List<Usuario_rol>allRolsRegister();
    
}
