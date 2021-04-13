package gaes5.mouth.system.maven.Config;

import gaes5.mouth.system.maven.Exeptions.ConexionExeption;

/**
 *
 * @author Cristo
 */
public class Test   {
    
    public static void main(String[] args) throws ConexionExeption {
   
        ConectDB con = new ConectDB();
        
        con.abrirConexion();
    }
    
}
