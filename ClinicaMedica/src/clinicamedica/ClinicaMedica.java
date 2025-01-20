package clinicamedica;

import java.util.List;
import modelo.PaqueteServicios;
import modelo.Servicio;



public class ClinicaMedica {

    public static void main(String[] args) {

    Servicio servicioUno = new Servicio("S001", "Hemglobina", "Examen de sangre exotico xD", 7500);
    Servicio servicioDos = new Servicio("S002","Perfil Lipidico","Examen de perfil lipidico",12500);

        PaqueteServicios primerPaquete = new PaqueteServicios("P001");
        
        primerPaquete.agregarServicio(servicioDos);
        primerPaquete.agregarServicio(servicioUno);
        
        primerPaquete.eliminarServicio(servicioUno);
    }
}
    
