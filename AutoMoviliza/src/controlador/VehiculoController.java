package controlador;

import Bd.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;
import modelo.Vehiculo;

public class VehiculoController {

    Conexion cx;
    public VehiculoController(){
        cx = new Conexion();
        cx.conectar();
    }
    
        public List<String> obtenerModelo(){
            List<String> modelos = new ArrayList<>();
            String query = "SELECT * FROM vehiculo";
            
            try {
                ResultSet rs = cx.EjecutarQuery(query);
                while(rs.next()){
                    if(!(modelos.contains(rs.getString("modelo")))){
                        modelos.add(rs.getString("modelo"));
                    }
                }
            } catch (Exception e) {
                System.out.println("Error obtener modelos " + e.getMessage());
            }
            return modelos;
        }
        
     public List<String> obtenerMarcas(){
            List<String>  marcas = new ArrayList<>();
            String query = "SELECT * FROM vehiculo";
            
            try {
                ResultSet rs = cx.EjecutarQuery(query);
                while(rs.next()){
                    if(!(marcas.contains(rs.getString("marca")))){
                        marcas.add(rs.getString("marca"));
                    }
                }
            } catch (Exception e) {
                System.out.println("Error obtener modelos " + e.getMessage());
            }
            return marcas;
        }

        public List<Vehiculo> obtenerVehiculos(){
            List<Vehiculo> vehiculos = new ArrayList<>();
            String query = "SELECT * FROM vehiculo";
            
            try {
                ResultSet rs = cx.EjecutarQuery(query);
                while(rs.next()){
                    vehiculos.add(new Vehiculo(
                        rs.getInt("idVehiculo"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDate("anio"),
                        rs.getString("tipo"),
                        rs.getInt("precio"),
                        rs.getString("estado")
                    ));  
                }
            } catch (Exception e) {
                System.out.println("Error obtener vehiculos " + e.getMessage());
            }
            return vehiculos;
        }          

}
