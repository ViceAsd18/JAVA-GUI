/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vicen
 */
public class ServicioPaquete {
    private String codigoPaquete;
    private String codigoServicio;

    public ServicioPaquete() {
    }

    public ServicioPaquete(String codigoPaquete, String codigoServicio) {
        this.codigoPaquete = codigoPaquete;
        this.codigoServicio = codigoServicio;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    @Override
    public String toString() {
        return "ServicioPaquete{" + "codigoPaquete=" + codigoPaquete + ", codigoServicio=" + codigoServicio + '}';
    }
}
