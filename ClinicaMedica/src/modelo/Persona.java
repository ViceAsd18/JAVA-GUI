package modelo;

import java.time.LocalDate;

public abstract class Persona {
    private int idPersona;
    private String nombre,apellido;
    private int rut;
    private String digitoVerificador;
    private LocalDate fechaNacimiento;
    private String email;
    private int numero;
    private String direccion; 

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, int rut, String digitoVerificador, LocalDate fechaNacimiento, String email, int numero, String direccion) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.digitoVerificador = digitoVerificador;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.numero = numero;
        this.direccion = direccion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", digitoVerificador=" + digitoVerificador + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", numero=" + numero + ", direccion=" + direccion + '}';
    }
}
