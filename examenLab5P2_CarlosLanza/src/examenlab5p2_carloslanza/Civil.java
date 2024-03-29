package examenlab5p2_carloslanza;

import java.util.ArrayList;
import java.util.Date;

public class Civil extends Usuario {
    ArrayList<Tramite> trámites = new ArrayList();

    public Civil(String nombre, String apellido, String contraseña, Date fechaDeNacimiento, String sexo, String departamento) {
        super(nombre, apellido, contraseña, fechaDeNacimiento, sexo, departamento);
    }

    public ArrayList<Tramite> getTramites() {
        return trámites;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Civil{" + "trámites=" + trámites + '}';
    }
    
    
}
