package examenlab5p2_carloslanza;

import java.util.Date;

public class Trámite {
    private String nombre;
    private String descripción;
    private Date fecha;
    private String usuarioDNI;

    public Trámite(String nombre, String descripción, Date fecha, String usuarioDNI) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.fecha = fecha;
        this.usuarioDNI = usuarioDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuarioDNI() {
        return usuarioDNI;
    }

    public void setUsuarioDNI(String usuarioDNI) {
        this.usuarioDNI = usuarioDNI;
    }

    @Override
    public String toString() {
        return "Trámite{" + "nombre=" + nombre + ", descripción=" + descripción + ", fecha=" + fecha + ", usuarioDNI=" + usuarioDNI + '}';
    }
}
