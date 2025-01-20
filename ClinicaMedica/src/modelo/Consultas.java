package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consultas {
    private int idConsulta;
    private LocalDate fechaConsulta;
    private LocalTime horaConsulta;
    private Paciente unPaciente;
    private Medico unMedico;
    private Object servicioSeleccionado;
    private double montoTotal;
    private Boolean pagado;

    public Consultas() {
    }

    public Consultas(int idConsulta, LocalDate fechaConsulta, LocalTime horaConsulta, Paciente unPaciente, Medico unMedico, Object servicioSeleccionado, double montoTotal, Boolean pagado) {
        this.idConsulta = idConsulta;
        this.fechaConsulta = fechaConsulta;
        this.horaConsulta = horaConsulta;
        this.unPaciente = unPaciente;
        this.unMedico = unMedico;
        this.servicioSeleccionado = servicioSeleccionado;
        this.montoTotal = montoTotal;
        this.pagado = pagado;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Paciente getUnPaciente() {
        return unPaciente;
    }

    public void setUnPaciente(Paciente unPaciente) {
        this.unPaciente = unPaciente;
    }

    public Medico getUnMedico() {
        return unMedico;
    }

    public void setUnMedico(Medico unMedico) {
        this.unMedico = unMedico;
    }

    public Object getServicioSeleccionado() {
        return servicioSeleccionado;
    }

    public void setServicioSeleccionado(Object servicioSeleccionado) {
        this.servicioSeleccionado = servicioSeleccionado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Consultas{" + "idConsulta=" + idConsulta + ", fechaConsulta=" + fechaConsulta + ", horaConsulta=" + horaConsulta + ", unPaciente=" + unPaciente + ", unMedico=" + unMedico + ", servicioSeleccionado=" + servicioSeleccionado + ", montoTotal=" + montoTotal + ", pagado=" + pagado + '}';
    }
}
