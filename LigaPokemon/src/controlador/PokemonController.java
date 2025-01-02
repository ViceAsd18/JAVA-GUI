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
    
    public int obtenerCantidadPokemonesEntrenadores(int parIdEntrenador){
        int contador = 0;
        String query = "SELECT COUNT(*) FROM pokemon WHERE idEntrenador = ?;";

        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setInt(1, parIdEntrenador);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                contador = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error obtener cantidad de pokemones del entrenador " + e.getMessage());
        }
        return contador;
    }
    
    
    public Pokemon buscarPokemonPorId(int parIdPókemon){
        Pokemon pokemonEncontrado = null;
        String query = "SELECT * FROM pokemon WHERE idPokemon = " + parIdPókemon +";";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                pokemonEncontrado = new Pokemon(
                        rs.getInt("idPokemon"),
                        rs.getString("nombre"),
                        rs.getString("especie"),
                        rs.getString("tipoPrincipal"),
                        rs.getString("tipoSecundario"),
                        rs.getInt("nivel"),
                        rs.getInt("idEntrenador")
                );
            }
        } catch (Exception e) {
            System.out.println("Error buscar pokemon por id " + e.getMessage());
        }
        return  pokemonEncontrado;
    }
    
    public void agregarPokemon(String parNombre,String parEspecie,String tipoPrincipal,String tipoSecundario,int parNivel, int parIdEntrenador){
        String query = "INSERT INTO pokemon (nombre,especie,tipoPrincipal,tipoSecundario,nivel,idEntrenador) VALUES (?,?,?,?,?,?);";
        
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
    
    public void eliminarPokemon(int parIdPokemon){
        String query = "DELETE FROM pokemon WHERE idPokemon = ?";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setInt(1,parIdPokemon);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error Eliminar Pokemon " + e.getMessage());
        }
    }
    
    public void editarPokemon(int idPokemon,String nombre,String especie,String tipoPrincipal, String tipoSecundario, int nivel, int idEntrenador){
        String query = "UPDATE pokemon SET nombre = ?, especie = ?, tipoPrincipal = ?, tipoSecundario = ?, nivel = ?, idEntrenador = ? WHERE idPokemon = ?;";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, especie);
            ps.setString(3, tipoPrincipal);
            ps.setString(4, tipoSecundario);
            ps.setInt(5, nivel);
            ps.setInt(6, idEntrenador);
            ps.setInt(7, idPokemon);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error editar Pokemon " + e.getMessage());
        }
    }
    
    
    
}
