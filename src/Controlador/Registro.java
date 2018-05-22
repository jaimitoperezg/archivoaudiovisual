package Controlador;

import Modelo.Adquisicion;
import sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jperez
 */
public class Registro {
    private static final String INSERT_ADQUISICION = "INSERT INTO adquisicion (tipo_adquisicion) VALUES (?)";
    private static final String FIND_ADQUISICION = "SELECT * FROM adquisicion WHERE tipo_adquisicion = ?";
    private static final String SEL_ADQUISICION = "SELECT * FROM adquisicion";
    
    
    
    
    public static boolean insAdqui(Adquisicion adq) {
        try{
            Connection conexion = Conexion.getConnect();
            PreparedStatement insAdq = conexion.prepareStatement(INSERT_ADQUISICION);
            insAdq.setString(1, adq.getTipo_adquisicion());
            insAdq.execute();
            insAdq.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error SQL al agregar el registro " + e.getMessage());
            return false;
        }
    }
    
    public static boolean findAdqui(Adquisicion adq) {
        try{
            Connection conexion = Conexion.getConnect();
            PreparedStatement findAdq = conexion.prepareStatement(FIND_ADQUISICION);
            findAdq.setString(1, adq.getTipo_adquisicion());
            findAdq.execute();
            findAdq.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error SQL al buscar el registro " + e.getMessage());
            return false;
        }
    }
    
    public static ResultSet setAdqui() throws SQLException {
        ResultSet result = null;
        Connection conexion = Conexion.getConnect();
        String sql_stmt = SEL_ADQUISICION;
        Statement statement = conexion.createStatement();
        try{
            result = statement.executeQuery(sql_stmt);
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar el registro " + e.getMessage());
        }
        return result;
    }
    
    public static int cuentaColumnas(ResultSet clm) throws SQLException {
        int cantidadColumnas = 0;
        try {
            ResultSetMetaData rsMd = clm.getMetaData();
            cantidadColumnas = rsMd.getColumnCount();
        } catch (SQLException e) {
            System.out.println("No se puede contar las columnas por un error SQL al obtener los registros desde la BBDD " + e.getMessage());
        }     
        return cantidadColumnas;
    }
    
    public ArrayList rs2Array(ResultSet rs) throws SQLException {
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            ArrayList results = new ArrayList();
                        
            while (rs.next())
            {
                HashMap fila = new HashMap();
                results.add(fila);
                
                for (int i=1;i<=cantidadColumnas;i++) {
                    fila.put(rsMd.getColumnName(i),rs.getObject(i));
                }
            }
        return results;
    }
}
