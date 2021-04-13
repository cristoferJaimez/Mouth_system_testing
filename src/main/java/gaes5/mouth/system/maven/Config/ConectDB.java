package gaes5.mouth.system.maven.Config;

import gaes5.mouth.system.maven.Enums.ConexionDBEnums;
import gaes5.mouth.system.maven.Exeptions.ConexionExeption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristo
 */
public class ConectDB {

    private static String url = "jdbc:mysql://localhost:3306/mouth_system?useTimeZone=true&serverTimezone=UTC";
    private static String usuario = "root";
    private static String password = "";

    public void abrirConexion() throws ConexionExeption{
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // De esta forma cargamos la clase Driver de MySQL.
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conectar = DriverManager.getConnection(url, usuario, password);

            try {
                Statement s = conectar.createStatement();
                ResultSet rs = s.executeQuery("select * from datos_usuario ");

                while (rs.next()) {
                    System.out.println(rs.getString("pri_nom") + " - " + rs.getInt("num_doc"));
                }

                conectar.close();

            } catch (SQLException e) {
                throw new ConexionExeption(ConexionDBEnums.ERROR_LEER, e);
                //System.out.println("Error al consultar datos en base de datos");
                //conectar.close();

            }

            System.out.println("Conexión Exitosa");

        } catch (SQLException ex) {
            throw  new ConexionExeption(ConexionDBEnums.ERROR_CONEXION, ex);
            //System.out.println("Error al abrir Conexión: :( " + ex.getMessage());
 

        }
    }

}
