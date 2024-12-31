package controlador;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.Pokemon;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class PokemonController {
    
    Conexion cx;
    public PokemonController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Pokemon> obtenerPokemonesPorTipo(String parTipo){
        List<Pokemon> pokemones = new ArrayList<>();
        String query = "SELECT * FROM pokemon WHERE tipoPrincipal = '" + parTipo + "';";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                pokemones.add(new Pokemon(
                        rs.getInt("idPokemon"),
                        rs.getString("nombre"),
                        rs.getString("especie"),
                        rs.getString("tipoPrincipal"),
                        rs.getString("tipoSecundario"),
                        rs.getInt("nivel"),
                        rs.getInt("idEntrenador")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error obtener Pokemones Por Tipo " + e.getMessage());
        }
        return pokemones;
    }    
    
    public List<Pokemon> obtenerPokemones(){
        List<Pokemon> pokemones = new ArrayList<>();
        String query = "SELECT * FROM pokemon";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                pokemones.add(new Pokemon(
                        rs.getInt("idPokemon"),
                        rs.getString("nombre"),
                        rs.getString("especie"),
                        rs.getString("tipoPrincipal"),
                        rs.getString("tipoSecundario"),
                        rs.getInt("nivel"),
                        rs.getInt("idEntrenador")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error obtener Pokemones " + e.getMessage());
        }
        return pokemones;
    }
    
    public void agregarPokemon(String parNombre,String parEspecie,String tipoPrincipal,String tipoSecundario,int parNivel, int parIdEntrenador){
        String query = "INSERT INTO pokemon (nombres,especie,tipoPrincipal,tipoSecundario,nivel,idEntrenador) VALUES (?,?,?,?,?,?);";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1,parNombre);
            ps.setString(2, parEspecie);
            ps.setString(3,tipoPrincipal);
            ps.setString(4, tipoSecundario);
            ps.setInt(5,parNivel);
            ps.setInt(6, parIdEntrenador);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error AgregarPokemon " + e.getMessage());
        }
    }
    
    
    
    
}
