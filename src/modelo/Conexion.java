
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    public static String base ="concesionario3" ;
    public static String url = "jdbc:mysql://localhost:3306/"+base;;
    public static String user = "root";
    public static String password = "a1b2c3d4";
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
