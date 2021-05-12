/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.DAO.Interface.IUsuario_rol;
import gaes5.mouth.system.maven.Models.Usuario_rol;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author cristo
 */
@Stateless
public class Usuario_rolDAO_JPA extends GenericDAO<Usuario_rol, Integer> implements IUsuario_rol{

     public Usuario_rolDAO_JPA() {
        super(Usuario_rol.class);
    }

     @Override
    public List<Usuario_rol> typeRol(Integer id) {
        try {

            String query = "SELECT * FROM datos_usuario"
                    + " JOIN usuario_rol ON datos_usuario.id_usuario = usuario_rol.datos_usuario_id_usuario"
                    + " JOIN tipo_usuario ON usuario_rol.tipo_usuario_id_tipo_usuario = tipo_usuario.id_tipo_usuario  WHERE datos_usuario.id_usuario = " + id + "";
            Query qt = em.createNativeQuery(query, Usuario_rol.class);
            //System.out.println("Lista de roles: " + qt.getResultList());
            List<Usuario_rol> lista = qt.getResultList();
            //System.out.println( "usuarios rol "+lista);
            return lista;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Usuario_rol> allRolsRegister() {
        try {

            String query = "SELECT * FROM datos_usuario"
                    + " JOIN usuario_rol ON datos_usuario.id_usuario = usuario_rol.datos_usuario_id_usuario"
                    + " JOIN tipo_usuario ON usuario_rol.tipo_usuario_id_tipo_usuario = tipo_usuario.id_tipo_usuario";
            Query qt = em.createNativeQuery(query, Usuario_rol.class);
            //System.out.println("Lista de roles: " + qt.getResultList());
            List<Usuario_rol> lista = qt.getResultList();
            //System.out.println( "usuarios rol "+lista);
            return lista;
        } catch (Exception e) {
            return null;
        } 
    }
    
    
    
}
