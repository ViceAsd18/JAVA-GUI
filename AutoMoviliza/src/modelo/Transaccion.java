package modelo;

import java.util.Date;

public class Transaccion {
    private int idTransaccion;
    private Date fecha;
    private String tipoTransaccion;
    private int montoTotal;
    private int idVehiculo;
    private String rutCliente;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, Date fecha, String tipoTransaccion, int montoTotal, int idVehiculo, String rutCliente) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.montoTotal = montoTotal;
        this.idVehiculo = idVehiculo;
        this.rutCliente = rutCliente;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", fecha=" + fecha + ", tipoTransaccion=" + tipoTransaccion + ", montoTotal=" + montoTotal + ", idVehiculo=" + idVehiculo + ", rutCliente=" + rutCliente + '}';
    }
}
