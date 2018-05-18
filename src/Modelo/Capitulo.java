package Modelo;

/**
 *
 * @author jperez
 */
public class Capitulo {
    private int id_capitulo;
    private int id_serie_cap;
    private String nombre_capitulo;
    private int duracion;
    private String desc_capitulo;
    private int temporada;
    
    public Capitulo() {
        this.id_serie_cap = 0;
        this.nombre_capitulo = "";
        this.duracion = 0;
        this.desc_capitulo = "Sin descripción";
        this.temporada = 0;
    }

    public Capitulo(int id_serie_cap, String nombre_capitulo, int duracion, String desc_capitulo, int temporada) {
//        this.id_capitulo = id_capitulo;
        this.id_serie_cap = id_serie_cap;
        this.nombre_capitulo = nombre_capitulo;
        this.duracion = duracion;
        this.desc_capitulo = desc_capitulo;
        this.temporada = temporada;
    }
    
    public Capitulo(int id_capitulo, int id_serie_cap, String nombre_capitulo, int duracion, String desc_capitulo, int temporada) {
        this.id_capitulo = id_capitulo;
        this.id_serie_cap = id_serie_cap;
        this.nombre_capitulo = nombre_capitulo;
        this.duracion = duracion;
        this.desc_capitulo = desc_capitulo;
        this.temporada = temporada;
    }

    public int getId_capitulo() {
        return id_capitulo;
    }

    public void setId_capitulo(int id_capitulo) {
        this.id_capitulo = id_capitulo;
    }

    public int getId_serie_cap() {
        return id_serie_cap;
    }

    public void setId_serie_cap(int id_serie_cap) {
        this.id_serie_cap = id_serie_cap;
    }

    public String getNombre_capitulo() {
        return nombre_capitulo;
    }

    public void setNombre_capitulo(String nombre_capitulo) {
        this.nombre_capitulo = nombre_capitulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDesc_capitulo() {
        return desc_capitulo;
    }

    public void setDesc_capitulo(String desc_capitulo) {
        this.desc_capitulo = desc_capitulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}