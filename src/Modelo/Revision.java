package Modelo;

/**
 *
 * @author jperez
 */
public class Revision {
    private int id_revision;
    private int id_serie_rev;
    private String observacion;
    private int estado;
    private String fecha_observacion;
    private String revisor;

    public Revision() {
//        this.id_revision = id_revision;
        this.id_serie_rev = 0;
        this.observacion = "Sin observaciones";
        this.estado = 0;
        this.fecha_observacion = "01-01-1900 00:00:00";
        this.revisor = "NN";
    }
    
    public Revision(int id_serie_rev, String observacion, int estado, String fecha_observacion, String revisor) {
//        this.id_revision = id_revision;
        this.id_serie_rev = id_serie_rev;
        this.observacion = observacion;
        this.estado = estado;
        this.fecha_observacion = fecha_observacion;
        this.revisor = revisor;
    }
    
    public Revision(int id_revision, int id_serie_rev, String observacion, int estado, String fecha_observacion, String revisor) {
        this.id_revision = id_revision;
        this.id_serie_rev = id_serie_rev;
        this.observacion = observacion;
        this.estado = estado;
        this.fecha_observacion = fecha_observacion;
        this.revisor = revisor;
    }

    public int getId_revision() {
        return id_revision;
    }

    public void setId_revision(int id_revision) {
        this.id_revision = id_revision;
    }

    public int getId_serie_rev() {
        return id_serie_rev;
    }

    public void setId_serie_rev(int id_serie_rev) {
        this.id_serie_rev = id_serie_rev;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_observacion() {
        return fecha_observacion;
    }

    public void setFecha_observacion(String fecha_observacion) {
        this.fecha_observacion = fecha_observacion;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
     
}
