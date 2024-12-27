package modelo;

import java.util.Date;

public class Combate {
    private int idCombate;
    private Date fecha;
    private String lugar;
    private int idEntrenadorUno;
    private int idEntrenadorDos;
    private int idGanador;

    public Combate() {
    }

    public Combate(int idCombate, Date fecha, String lugar, int idEntrenadorUno, int idEntrenadorDos, int idGanador) {
        this.idCombate = idCombate;
        this.fecha = fecha;
        this.lugar = lugar;
        this.idEntrenadorUno = idEntrenadorUno;
        this.idEntrenadorDos = idEntrenadorDos;
        this.idGanador = idGanador;
    }

    public int getIdCombate() {
        return idCombate;
    }

    public void setIdCombate(int idCombate) {
        this.idCombate = idCombate;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getIdEntrenadorUno() {
        return idEntrenadorUno;
    }

    public void setIdEntrenadorUno(int idEntrenadorUno) {
        this.idEntrenadorUno = idEntrenadorUno;
    }

    public int getIdEntrenadorDos() {
        return idEntrenadorDos;
    }

    public void setIdEntrenadorDos(int idEntrenadorDos) {
        this.idEntrenadorDos = idEntrenadorDos;
    }

    public int getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(int idGanador) {
        this.idGanador = idGanador;
    }

    @Override
    public String toString() {
        return "Combate{" + "idCombate=" + idCombate + ", fecha=" + fecha + ", lugar=" + lugar + ", idEntrenadorUno=" + idEntrenadorUno + ", idEntrenadorDos=" + idEntrenadorDos + ", idGanador=" + idGanador + '}';
    }
}
