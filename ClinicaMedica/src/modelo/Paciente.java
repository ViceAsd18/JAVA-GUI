package modelo;

import java.time.LocalDate;

public class Paciente extends Persona{

    public Paciente() {
    }

    public Paciente(int idPersona, String nombre, String apellido, int rut, String digitoVerificador, LocalDate fechaNacimiento, String email, int numero, String direccion) {
        super(idPersona, nombre, apellido, rut, digitoVerificador, fechaNacimiento, email, numero, direccion);
    }

    
}
