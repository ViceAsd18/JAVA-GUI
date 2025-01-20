package modelo;

import java.util.ArrayList;
import java.util.List;

public class PaqueteServicios {
    private String codigopaquete;
    private List<Servicio> listaServiciosIncluidos = new ArrayList<>();
    private double precioPaquete;

    public PaqueteServicios() {
    }

    public PaqueteServicios(String codigopaquete) {
        this.codigopaquete = codigopaquete;
        this.precioPaquete = 0;
    }

    public String getCodigopaquete() {
        return codigopaquete;
    }

    public void setCodigopaquete(String codigopaquete) {
        this.codigopaquete = codigopaquete;
    }

    public List<Servicio> getListaServiciosIncluidos() {
        return listaServiciosIncluidos;
    }

    public void setListaServiciosIncluidos(List<Servicio> listaServiciosIncluidos) {
        this.listaServiciosIncluidos = listaServiciosIncluidos;
    }

    public double getPrecioPaquete() {
        return precioPaquete;
    }

    public void setPrecioPaquete(double precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    @Override
    public String toString() {
        return "PaqueteServicios{" + "codigopaquete=" + codigopaquete + ", listaServiciosIncluidos=" + listaServiciosIncluidos + ", precioPaquete=" + precioPaquete + '}';
    }
    
    private double calcularTotalPrecio(){
        double Total = 0;
        
        for(Servicio i: this.listaServiciosIncluidos){
            Total += i.getPrecio();
        }
        Total = Total*0.85;
        return Total;
    }
    
    //CRUD
    public List<Servicio> obtenerLista(){
        return listaServiciosIncluidos;
    }
    
    public void agregarServicio(Servicio parServicio){
        listaServiciosIncluidos.add(parServicio);
        this.precioPaquete = calcularTotalPrecio();
    }
    
    public void eliminarServicio(Servicio parServicio){
        listaServiciosIncluidos.remove(parServicio);
        this.precioPaquete = calcularTotalPrecio();
    }
    
}
