package modelo;

import java.util.Date;

public class Vehiculo {
    private int idVehiculo;
    private String marca,modelo;
    private Date año;
    private String tipo;
    private int precio;
    private String estado;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String marca, String modelo, Date año, String tipo, int precio, String estado) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", tipo=" + tipo + ", precio=" + precio + ", estado=" + estado + '}';
    }
    
    
}
