package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona{
    private String especialidadMedica;
    private List<String> turnosDisponibles = new ArrayList<>(); 
    private int sueldo;

    public Medico() {
    }

    public Medico(String especialidadMedica, int sueldo) {
        this.especialidadMedica = especialidadMedica;
        this.sueldo = sueldo;
    }

    public Medico(String especialidadMedica, int sueldo, int idPersona, String nombre, String apellido, int rut, String digitoVerificador, LocalDate fechaNacimiento, String email, int numero, String direccion) {
        super(idPersona, nombre, apellido, rut, digitoVerificador, fechaNacimiento, email, numero, direccion);
        this.especialidadMedica = especialidadMedica;
        this.sueldo = sueldo;
    }

    public String getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    public List<String> getTurnosDisponibles() {
        return turnosDisponibles;
    }

    public void setTurnosDisponibles(List<String> turnosDisponibles) {
        this.turnosDisponibles = turnosDisponibles;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return "Medico{" + "especialidadMedica=" + especialidadMedica + ", turnosDisponibles=" + turnosDisponibles + ", sueldo=" + sueldo + '}';
    }
    
}
