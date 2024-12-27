package modelo;

public class Entrenador {
    private int idEntrenador;
    private String nombre;
    private String region;
    private int medallasGanadas;
    private int nivelExperiencia;

    public Entrenador() {
    }

    public Entrenador(int idEntrenador, String nombre, String region, int medallasGanadas, int nivelExperiencia) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.region = region;
        this.medallasGanadas = medallasGanadas;
        this.nivelExperiencia = nivelExperiencia;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getMedallasGanadas() {
        return medallasGanadas;
    }

    public void setMedallasGanadas(int medallasGanadas) {
        this.medallasGanadas = medallasGanadas;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idEntrenador=" + idEntrenador + ", nombre=" + nombre + ", region=" + region + ", medallasGanadas=" + medallasGanadas + ", nivelExperiencia=" + nivelExperiencia + '}';
    }

}
