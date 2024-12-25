package peluqueriacanina.logica;

public class Dueño {
    private int idDuenio;
    private String nombre;
    private String celularDuenio;

    public Dueño() {
    }

    public Dueño(int idDuenio, String nombre, String celularDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celularDuenio = celularDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "idDuenio=" + idDuenio + ", nombre=" + nombre + ", celularDuenio=" + celularDuenio + '}';
    }
    
}
