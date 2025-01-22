package controlador;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.Servicio;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ServicioController {

        Conexion cx;
        
    public ServicioController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Servicio> obtenerServicios(){
        List<Servicio> servicios = new ArrayList<>();
        String query = "SELECT * FROM servicio";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                servicios.add(new Servicio(
                        rs.getString("codigoServicio"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error obtener servicios " + e.getMessage());
        }
        return servicios;
    }

    public void agregarServicio(String parCodigoServicio, String parNombre, String parDescripcion, double parPrecio){
        String query = "INSERT INTO servicio VALUES (?,?,?,?);";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parCodigoServicio);
            ps.setString(2,parNombre);
            ps.setString(3,parDescripcion);
            ps.setDouble(4, parPrecio);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error agregar servicio " + e.getMessage());
        }
    }
    
    public void eliminarServicio(String parCodigoServicio){
        String query = "DELETE FROM servicio WHERE codigoServicio = ?;";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parCodigoServicio);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error eliminar Servicio " + e.getMessage());
        }
    }
    
    
    
    
    
}
