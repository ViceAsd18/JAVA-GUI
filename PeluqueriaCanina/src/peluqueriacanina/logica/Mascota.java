package peluqueriacanina.logica;

public class Mascota {
    private int num_cliente;
    private String nombreMascota;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEspecial;
    private String observaciones;
    
    private Dueño unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String observaciones, Dueño unDuenio) {
        this.num_cliente = num_cliente;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueño getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Dueño unDuenio) {
        this.unDuenio = unDuenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_cliente=" + num_cliente + ", nombreMascota=" + nombreMascota + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencionEspecial=" + atencionEspecial + ", observaciones=" + observaciones + ", unDuenio=" + unDuenio + '}';
    }
    
    
}
