package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leidy Y. Quiñones G © Leidy Quiñones 
 */
public class Conexion {

    // conexión local
    public static Connection conectar() {
        try {
            String url = "jdbc:mariadb://localhost:3306/bd_sistema_ventas";
            String usuario = "root";
            String contraseña = "admin";
            Connection cn = DriverManager.getConnection(url, usuario, contraseña);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local: " + e);
        }
        return null;
    }
}

