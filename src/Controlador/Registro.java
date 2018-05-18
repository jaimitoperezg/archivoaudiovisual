package Controlador;

import Modelo.Adquisicion;
import sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
