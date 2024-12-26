package controlador;

import Bd.Conexion;
import java.time.LocalDate;
import modelo.Vehiculo;

import java.sql.PreparedStatement;
import java.sql.Date;

public class TransaccionController {

    Conexion cx;
    public TransaccionController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    VehiculoController vc = new VehiculoController();
    
    public void agregarTransaccion(String parTipoTransaccion, int IdVehiculo, String parRutCliente){
        Vehiculo vehiculoEncontrado = vc.buscarVehiculoPorId(String.valueOf(IdVehiculo));
        LocalDate fechaActual = LocalDate.now();
        Date sqlDate = Date.valueOf(fechaActual);
        int precio = vehiculoEncontrado.getPrecio();
        
        String query = "INSERT INTO transaccion (fecha,tipoTransaccion,monoTotal,idVehiculo,rutCliente)VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setDate (1, sqlDate);
            ps.setString(2, parTipoTransaccion);
            ps.setInt(3, precio);
            ps.setInt(4, IdVehiculo);
            ps.setString(5, parRutCliente);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error agregar Transaccion " + e.getMessage());
        }
    }
    
    
    
    
}
