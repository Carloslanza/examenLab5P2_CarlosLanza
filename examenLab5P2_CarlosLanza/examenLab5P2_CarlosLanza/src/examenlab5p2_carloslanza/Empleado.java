package examenlab5p2_carloslanza;

import java.util.Date;

public class Empleado extends Usuario {
    private String carrera;
    private String puestoLaboral;
    private int añosRNP;

    public Empleado(String carrera, String puestoLaboral, int añosRNP, String nombre, String apellido, String contraseña, Date fechaDeNacimiento, char sexo, String departamento) {
        super(nombre, apellido, contraseña, fechaDeNacimiento, sexo, departamento);
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.añosRNP = añosRNP;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public int getAñosRNP() {
        return añosRNP;
    }

    public void setAñosRNP(int añosRNP) {
        this.añosRNP = añosRNP;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Empleado{" + "carrera=" + carrera + ", puestoLaboral=" + puestoLaboral + ", a\u00f1osRNP=" + añosRNP + '}';
    }
}
