package Modelo;

/**
 *
 * @author jperez
 */
public class Serie {
    private int id;
    private String nombre_serie;
    private int num_capitulos;
    private int num_temporada;
    private int adquisicion;
    private int pais;
    private int productora;
    private int ano_produccion;
    private int formato_master;
    private int genero_tv;
    private int tecnica;
    private int publico_objetivo;
    private int tema;
    private String desc_serie;
    private String inicio_derechos;
    private String fin_derechos;
    private int derechos_web;
    private int derechos_descarga;
    private int derechos_youtube;
    
    public Serie() {
        this.nombre_serie = "";
        this.num_capitulos = 0;
        this.num_temporada = 0;
        this.adquisicion = 0;
        this.pais = 0;
        this.productora = 0;
        this.ano_produccion = 1900;
        this.formato_master = 0;
        this.genero_tv = 0;
        this.tecnica = 0;
        this.publico_objetivo = 0;
        this.tema = 0;
        this.desc_serie = "Sin descripción";
        this.inicio_derechos = "01-01-1900 00:00:00";
        this.fin_derechos = "01-01-2100 00:00:00";
        this.derechos_web = 0;
        this.derechos_descarga = 0;
        this.derechos_youtube = 0;
    }
    
    public Serie(String nombre_serie, int num_capitulos, int num_temporada, int adquisicion, int pais, int productora, int ano_produccion, int formato_master, int genero_tv, int tecnica, int publico_objetivo, int tema, String desc_serie, String inicio_derechos, String fin_derechos, int derechos_web, int derechos_descarga, int derechos_youtube) {
//        this.id = id;
        this.nombre_serie = nombre_serie;
        this.num_capitulos = num_capitulos;
        this.num_temporada = num_temporada;
        this.adquisicion = adquisicion;
        this.pais = pais;
        this.productora = productora;
        this.ano_produccion = ano_produccion;
        this.formato_master = formato_master;
        this.genero_tv = genero_tv;
        this.tecnica = tecnica;
        this.publico_objetivo = publico_objetivo;
        this.tema = tema;
        this.desc_serie = desc_serie;
        this.inicio_derechos = inicio_derechos;
        this.fin_derechos = fin_derechos;
        this.derechos_web = derechos_web;
        this.derechos_descarga = derechos_descarga;
        this.derechos_youtube = derechos_youtube;
    }
    
    public Serie(int id, String nombre_serie, int num_capitulos, int num_temporada, int adquisicion, int pais, int productora, int ano_produccion, int formato_master, int genero_tv, int tecnica, int publico_objetivo, int tema, String desc_serie, String inicio_derechos, String fin_derechos, int derechos_web, int derechos_descarga, int derechos_youtube) {
        this.id = id;
        this.nombre_serie = nombre_serie;
        this.num_capitulos = num_capitulos;
        this.num_temporada = num_temporada;
        this.adquisicion = adquisicion;
        this.pais = pais;
        this.productora = productora;
        this.ano_produccion = ano_produccion;
        this.formato_master = formato_master;
        this.genero_tv = genero_tv;
        this.tecnica = tecnica;
        this.publico_objetivo = publico_objetivo;
        this.tema = tema;
        this.desc_serie = desc_serie;
        this.inicio_derechos = inicio_derechos;
        this.fin_derechos = fin_derechos;
        this.derechos_web = derechos_web;
        this.derechos_descarga = derechos_descarga;
        this.derechos_youtube = derechos_youtube;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_serie() {
        return nombre_serie;
    }

    public void setNombre_serie(String nombre_serie) {
        this.nombre_serie = nombre_serie;
    }

    public int getNum_capitulos() {
        return num_capitulos;
    }

    public void setNum_capitulos(int num_capitulos) {
        this.num_capitulos = num_capitulos;
    }

    public int getNum_temporada() {
        return num_temporada;
    }

    public void setNum_temporada(int num_temporada) {
        this.num_temporada = num_temporada;
    }

    public int getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(int adquisicion) {
        this.adquisicion = adquisicion;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public int getProductora() {
        return productora;
    }

    public void setProductora(int productora) {
        this.productora = productora;
    }

    public int getAno_produccion() {
        return ano_produccion;
    }

    public void setAno_produccion(int ano_produccion) {
        this.ano_produccion = ano_produccion;
    }

    public int getFormato_master() {
        return formato_master;
    }

    public void setFormato_master(int formate_master) {
        this.formato_master = formate_master;
    }

    public int getGenero_tv() {
        return genero_tv;
    }

    public void setGenero_tv(int genero_tv) {
        this.genero_tv = genero_tv;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getPublico_objetivo() {
        return publico_objetivo;
    }

    public void setPublico_objetivo(int publico_objetivo) {
        this.publico_objetivo = publico_objetivo;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public String getDesc_serie() {
        return desc_serie;
    }

    public void setDesc_serie(String desc_serie) {
        this.desc_serie = desc_serie;
    }

    public String getInicio_derechos() {
        return inicio_derechos;
    }

    public void setInicio_derechos(String inicio_derechos) {
        this.inicio_derechos = inicio_derechos;
    }

    public String getFin_derechos() {
        return fin_derechos;
    }

    public void setFin_derechos(String fin_derechos) {
        this.fin_derechos = fin_derechos;
    }

    public int getDerechos_web() {
        return derechos_web;
    }

    public void setDerechos_web(int derechos_web) {
        this.derechos_web = derechos_web;
    }

    public int getDerechos_descarga() {
        return derechos_descarga;
    }

    public void setDerechos_descarga(int derechos_descarga) {
        this.derechos_descarga = derechos_descarga;
    }

    public int getDerechos_youtube() {
        return derechos_youtube;
    }

    public void setDerechos_youtube(int derechos_youtube) {
        this.derechos_youtube = derechos_youtube;
    }
    
}
