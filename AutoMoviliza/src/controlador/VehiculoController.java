package controlador;

import Bd.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Vehiculo;

public class VehiculoController {

    Conexion cx;
    public VehiculoController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    public Vehiculo buscarVehiculoPorId(String parID){
        Vehiculo vehiculoEncontrado = null;
        String query = "SELECT * FROM vehiculo WHERE idVehiculo = " + parID + ";";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                vehiculoEncontrado = new Vehiculo(
                        rs.getInt("idVehiculo"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDate("anio"),
                        rs.getString("tipo"),
                        rs.getInt("precio"),
                        rs.getString("estado")
                );
            }
        } catch (Exception e) {
            System.out.println("Error buscar cliente por rut " + e.getMessage());
        }
        return  vehiculoEncontrado;
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

        
        
    public void agregarCliente(String parMarca,String parModelo,Date parAnio,String parTipo,int parPrecio,String parEstado){
        String query = "INSERT INTO vehiculo (marca,modelo,anio,tipo,precio,estado) VALUES(?,?,?,?,?,?);";
        
        java.sql.Date ingresoAnio = new java.sql.Date(parAnio.getTime());
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parMarca);
            ps.setString(2, parModelo);
            ps.setDate (3,ingresoAnio);
            ps.setString(4, parTipo);
            ps.setInt(5, parPrecio);
            ps.setString(6, parEstado);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error de agregar Vehiculo " + e.getMessage());
        }
   }      
        
    public void eliminarCliente(int parIdEliminar){
            String query = "DELETE FROM vehiculo WHERE idVehiculo = (?);";
            
            try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setInt(1, parIdEliminar);
            ps.executeUpdate();
        } catch (Exception e) {
                System.out.println("Error eliminar Cliente " + e.getMessage());
        }
    }
    
    
    
       
        
        
        
        
        
        
        
}
