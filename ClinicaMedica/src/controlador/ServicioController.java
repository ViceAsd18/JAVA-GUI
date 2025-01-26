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
    
    public Servicio buscarServicioPorCodigo(String parCodigo){
        String query = "SELECT * FROM servicio WHERE codigoServicio = '" + parCodigo + "';"; 
        Servicio servicioEncontrado = null;
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                servicioEncontrado = new Servicio(
                        rs.getString("codigoServicio"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio")
                );
            }
        } catch (Exception e) {
            System.out.println("Error buscar Servicio por codigo " + e.getMessage());
        }
        return servicioEncontrado;
    }
    
    



    
    //CRUD
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
    
    public void editarServicio(String parCodigoServicio,String parNombre,String parDescripcion, double parPrecio){
        String query = "UPDATE servicio SET nombre = ?, descripcion = ?, precio = ? WHERE codigoServicio = ?;";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parNombre);
            ps.setString(2,parDescripcion);
            ps.setDouble(3, parPrecio);
            ps.setString(4, parCodigoServicio);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error editar Servicio " + e.getMessage());
        }
        
    }
    
    
    
    //Filtro
    public List<Servicio> filtroServicio(String parColumna,String buscador,String parOrderBy,int precioInicio,int precioFInal){
    String query = "SELECT * FROM servicio WHERE precio BETWEEN " + precioInicio + " AND " + precioFInal;
    
    if(buscador != null && !buscador.trim().isEmpty()){
        query += " AND " + parColumna + " LIKE '" + buscador + "%'";
    }
        
    query += " ORDER BY precio " + parOrderBy;
            
    List<Servicio> servicioEncontrados = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                servicioEncontrados.add(new Servicio(
                        rs.getString("codigoServicio"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error filtro servicio " + e.getMessage());
        }
    return servicioEncontrados;
    }
    
    
    
    
    
}

