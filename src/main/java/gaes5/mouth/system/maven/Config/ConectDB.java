package gaes5.mouth.system.maven.Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cristo
 */
public class ConectDB {

    private static String url = "jdbc:mysql://localhost:3306/mouth_system?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String usuario = "root";
    private static String password = "";

    public void abrirConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // De esta forma cargamos la clase Driver de MySQL.
            Connection conectar = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión Exitosa");
        } catch (Exception ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
    
    
}
