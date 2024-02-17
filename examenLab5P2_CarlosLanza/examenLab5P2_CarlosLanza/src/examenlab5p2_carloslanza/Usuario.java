package examenlab5p2_carloslanza;

import java.util.Date;
import java.util.Random;

public class Usuario {
    private String nombre;
    private String apellido;
    private String contraseña;
    private Date fechaDeNacimiento;
    private char sexo;
    private String departamento;
    private String DNI;

    public Usuario(String nombre, String apellido, String contraseña, Date fechaDeNacimiento, char sexo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
        generarDNI();
    }
    
    private void generarDNI() {
        Random random = new Random();
        int max = 0;
        int min = 0;
        String DNI = "";
        
        switch (departamento.toLowerCase()) {
            case "francisco morazan":
                DNI += "01";
                max = 28;
                min = 1;
                break;
            case "cortes":
                DNI += "02";
                max = 12;
                min = 1;
                break;
            case "comayagua":
                DNI += "03";
                max = 21;
                min = 1;
                break;
        }
        int azar = random.nextInt((max - min) + 1) + min;
        if (azar < 10) {
            DNI += "0" + azar + "-";
        } else {
            DNI += azar + "-";
        }
        
        int año = fechaDeNacimiento.getYear() + 1900;
        DNI += año + "-";
        
        for (int i = 0; i <= 4; i++) {
            DNI += random.nextInt();
        }
        
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contraseña=" + contraseña + ", fechaDeNacimiento=" + fechaDeNacimiento + ", sexo=" + sexo + ", departamento=" + departamento + ", DNI=" + DNI + '}';
    }
}
