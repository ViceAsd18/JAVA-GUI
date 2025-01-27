/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vicen
 */
public class Paquete {
    private String codigoPaquete;
    private String nombrePaquete;
    private double precioPaquete;

    public Paquete() {
    }

    public Paquete(String codigoPaquete, String nombrePaquete, double precioPaquete) {
        this.codigoPaquete = codigoPaquete;
        this.nombrePaquete = nombrePaquete;
        this.precioPaquete = precioPaquete;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public double getPrecioPaquete() {
        return precioPaquete;
    }

    public void setPrecioPaquete(double precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    @Override
    public String toString() {
        return "Paquete{" + "codigoPaquete=" + codigoPaquete + ", nombrePaquete=" + nombrePaquete + ", precioPaquete=" + precioPaquete + '}';
    }
}
