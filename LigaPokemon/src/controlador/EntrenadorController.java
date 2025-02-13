package controlador;

import Bd.Conexion;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Entrenador;

public class EntrenadorController {
    
    Conexion cx;
    public  EntrenadorController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    public boolean isNumber(String parString){
        boolean condicion = false;

        try {
            Integer.parseInt(parString);
            condicion = true;
        } catch (NumberFormatException e) {
            condicion = false;
        }
        return condicion;
    }

    public Entrenador buscarEntrenadorPorID(int parId){
        Entrenador entrenadorEncontrado = null;
        String query = "SELECT * FROM entrenador WHERE idEntrenador = " + parId + ";";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                    entrenadorEncontrado = new Entrenador(
                            rs.getInt("idEntrenador"),
                            rs.getString("nombre"),
                            rs.getString("region"),
                            rs.getInt("medallasGanadas"),
                            rs.getInt("nivelExperiencia")
                    );
            }
        } catch (Exception e) {
            System.out.println("Error buscar Entrenador por id "+ e.getMessage());
        }
        return entrenadorEncontrado;
    }
    
   
   public List<Entrenador> obtenerEntrenadores(){
       List<Entrenador> entrenadores = new ArrayList<>();
       String query = "SELECT * FROM entrenador";
       
       try {
           ResultSet rs = cx.EjecutarQuery(query);
           while(rs.next()){
               entrenadores.add(new Entrenador(
                       rs.getInt("idEntrenador"),
                       rs.getString("nombre"),
                       rs.getString("region"),
                       rs.getInt("medallasGanadas"),
                       rs.getInt("nivelExperiencia")
               ));
           }
       } catch (Exception e) {
           System.out.println("Error obtener Entrenadores " + e.getMessage());
       }
       return  entrenadores;
   }
   
   public List<Entrenador> obtenerEntrenadoresPorRegion(String parRegion){
       List<Entrenador> entrenadores = new ArrayList<>();
       String query = "SELECT * FROM entrenador WHERE region = '" + parRegion +"';";
       
       try {
           ResultSet rs = cx.EjecutarQuery(query);
           while(rs.next()){
               entrenadores.add(new Entrenador(
                       rs.getInt("idEntrenador"),
                       rs.getString("nombre"),
                       rs.getString("region"),
                       rs.getInt("medallasGanadas"),
                       rs.getInt("nivelExperiencia")
               ));
           }
       } catch (Exception e) {
           System.out.println("Error obtener Entrenadores " + e.getMessage());
       }
       return  entrenadores;
   }
    
   public void agregarEntrenador(String parNombre,String parRegion,int parMedallasGandas,int parNivelExperiencia){
       String query = "INSERT INTO entrenador (nombre,region,medallasganadas,nivelexperiencia) VALUES (?,?,?,?)";
       
       try {
           PreparedStatement ps = cx.getConnection().prepareStatement(query);
           ps.setString(1, parNombre);
           ps.setString(2, parRegion);
           ps.setInt(3, parMedallasGandas);
           ps.setInt(4, parNivelExperiencia);
           ps.executeUpdate();
       } catch (Exception e) {
           System.out.println("Error agregar Entrenador " + e.getMessage());
       }
   }   
   
    public void eliminarEntrenador(int parID){
        String query = "DELETE FROM entrenador WHERE idEntrenador = ?;";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setInt(1, parID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error eliminar Entrenador " + e.getMessage());
        }
    }
    
    
    public void editarEntrenador(int parId, String parNombre, String parRegion,int parMedallasGanadas, int parNivelExperiencia){
        String query = "UPDATE entrenador SET nombre = ?,region = ?, medallasGanadas = ?, nivelExperiencia = ? WHERE idEntrenador = ?;";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parNombre);
            ps.setString(2,parRegion);
            ps.setInt(3, parMedallasGanadas);
            ps.setInt(4, parNivelExperiencia);
            ps.setInt(5, parId);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error modificar Entrenador " + e.getMessage());
        }
    }
   
    
   
}
