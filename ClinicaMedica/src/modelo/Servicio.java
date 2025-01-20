package modelo;

public class Servicio {
    private String codigoServicio;
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicio() {
    }

    public Servicio(String codigoServicio, String nombre, String descripcion, double precio) {
        this.codigoServicio = codigoServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codigoServicio=" + codigoServicio + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
}

