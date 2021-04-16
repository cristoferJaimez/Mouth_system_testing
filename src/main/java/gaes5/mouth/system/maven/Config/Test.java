package gaes5.mouth.system.maven.Config;

import gaes5.mouth.system.maven.Controllers.SignInController;
import gaes5.mouth.system.maven.Exeptions.ConexionExeption;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Cristo
 */
public class Test {

    public static void main(String[] args) throws ConexionExeption {

        ConectDB con = new ConectDB();

        //con.abrirConexion();
        
        SignInController sn = new SignInController();
        
       
}

}
