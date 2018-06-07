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
    private static final String FIND_PAIS = "SELECT * FROM pais WHERE nombre_pais = ?";
    private static final String FIND_PRODUCTORA = "SELECT * FROM productora WHERE nombre_productora = ?";
    private static final String FIND_FORMATO = "SELECT * FROM formato WHERE nombre_formato = ?";
    private static final String FIND_GENERO = "SELECT * FROM genero WHERE nombre_genero = ?";
    private static final String FIND_TECNICA = "SELECT * FROM tecnica WHERE nombre_tecnica = ?";
    private static final String FIND_PUBLICO = "SELECT * FROM publico WHERE nombre_publico = ?";
    private static final String FIND_TEMA = "SELECT * FROM tema WHERE nombre_tema = ?";
    private static final String FIND_REVISION = "SELECT * FROM estado_revision WHERE nombre_estado = ?";
    private static final String SEL_ADQUISICION = "SELECT * FROM adquisicion";
    private static final String SEL_PAIS = "SELECT * FROM pais";
    private static final String SEL_PRODUCTORA = "SELECT * FROM productora";
    private static final String SEL_FORMATO = "SELECT * FROM formato";
    private static final String SEL_GENERO = "SELECT * FROM genero";
    private static final String SEL_TECNICA = "SELECT * FROM tecnica";
    private static final String SEL_PUBLICO = "SELECT * FROM publico";
    private static final String SEL_TEMA = "SELECT * FROM tema";
    private static final String SEL_ESTADO = "SELECT * FROM estado_revision";
    
    
    
    //Método para isertar nuevo tipo de Adquisición en la BBDD
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
    
    
    public static ResultSet findAdqui(int setSql, Adquisicion adq) throws SQLException {
        ResultSet result = null;
        String querySql = null;
        switch (setSql) {
            case 1: querySql = SEL_ADQUISICION;
                    break;
            case 2: querySql = SEL_PAIS;
                    break;
            case 3: querySql = SEL_PRODUCTORA;
                    break;
            case 4: querySql = SEL_FORMATO;
                    break;
            case 5: querySql = SEL_GENERO;
                    break;
            case 6: querySql = SEL_TECNICA;
                    break;
            case 7: querySql = SEL_PUBLICO;
                    break;
            case 8: querySql = SEL_TEMA;
                    break;
            case 9: querySql = SEL_ESTADO;
                    break;
        }
        Connection conexion = Conexion.getConnect();
        String sql_stmt = querySql;
        PreparedStatement buscaAdq = conexion.prepareStatement(querySql);
            buscaAdq.setString(1, adq.getTipo_adquisicion());
            buscaAdq.execute();
            buscaAdq.close();
            conexion.close();
        Statement statement = conexion.createStatement();
        try{
            result = statement.executeQuery(sql_stmt);
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar el registro " + e.getMessage());
        }
        return result;
    }
    
//    public static boolean findAdqui(Adquisicion adq) {
//        try{
//            Connection conexion = Conexion.getConnect();
//            PreparedStatement findAdq = conexion.prepareStatement(FIND_ADQUISICION);
//            findAdq.setString(1, adq.getTipo_adquisicion());
//            findAdq.execute();
//            findAdq.close();
//            conexion.close();
//            return true;
//        } catch (Exception e) {
//            System.out.println("Error SQL al buscar el registro " + e.getMessage());
//            return false;
//        }
//    }
    
    //Obtiene los datos para el resultset que se muestra en el Jtable de la vista de edición de elementos
    public static ResultSet setEdit(int setSql) throws SQLException {
        ResultSet result = null;
        String querySql = null;
        switch (setSql) {
            case 1: querySql = SEL_ADQUISICION;
                    break;
            case 2: querySql = SEL_PAIS;
                    break;
            case 3: querySql = SEL_PRODUCTORA;
                    break;
            case 4: querySql = SEL_FORMATO;
                    break;
            case 5: querySql = SEL_GENERO;
                    break;
            case 6: querySql = SEL_TECNICA;
                    break;
            case 7: querySql = SEL_PUBLICO;
                    break;
            case 8: querySql = SEL_TEMA;
                    break;
            case 9: querySql = SEL_ESTADO;
                    break;
        }
        Connection conexion = Conexion.getConnect();
        String sql_stmt = querySql;
        Statement statement = conexion.createStatement();
        try{
            result = statement.executeQuery(sql_stmt);
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar el registro " + e.getMessage());
        }
        return result;
    }
    
    //Cuenta las columnas del resultset para insertar en el Jtable
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
    
//    public ArrayList rs2Array(ResultSet rs) throws SQLException {
//            ResultSetMetaData rsMd = rs.getMetaData();
//            int cantidadColumnas = rsMd.getColumnCount();
//            
//            ArrayList results = new ArrayList();
//                        
//            while (rs.next())
//            {
//                HashMap fila = new HashMap();
//                results.add(fila);
//                
//                for (int i=1;i<=cantidadColumnas;i++) {
//                    fila.put(rsMd.getColumnName(i),rs.getObject(i));
//                }
//            }
//        return results;
//    }
}
