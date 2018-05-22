package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jperez
 */
public class Conexion {
    private static Connection conn = null;
    private static ResultSet rst;
    private static java.sql.Statement stmt;
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DB = "archivo_audiovisual";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PSS = "root";
    
    public static Connection getConnect()
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            System.out.println("Driver cargado");
            conn = DriverManager.getConnection(URL + DB, USER, PSS);
            if (conn != null) {
                System.out.println("Conectado a la BBDD");
            }
        }
        catch (ClassNotFoundException ce) {
            System.out.println("Falló el driver"+ ce);
        }
        catch (InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("Error al intentar conectar a la BBDD");
        }
        return conn;
    }
}
