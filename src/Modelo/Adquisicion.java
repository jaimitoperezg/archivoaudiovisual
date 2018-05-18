    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jperez
 */
public class Adquisicion {
    private int id;
    private String tipo_adquisicion;

    public Adquisicion() {
        this.id = 0;
        this.tipo_adquisicion = "";
    }
    
    public Adquisicion(String tipo_adquisicion) {
        //this.id = id;
        this.tipo_adquisicion = tipo_adquisicion;
    }
    
    public Adquisicion(int id, String tipo_adquisicion) {
        this.id = id;
        this.tipo_adquisicion = tipo_adquisicion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_adquisicion() {
        return tipo_adquisicion;
    }

    public void setTipo_adquisicion(String tipo_adquisicion) {
        this.tipo_adquisicion = tipo_adquisicion;
    }
}
