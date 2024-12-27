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
   
    
}
