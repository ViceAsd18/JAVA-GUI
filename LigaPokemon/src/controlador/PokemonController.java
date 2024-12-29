package controlador;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.Pokemon;

import java.sql.ResultSet;

public class PokemonController {
    
    Conexion cx;
    public PokemonController(){
        cx = new Conexion();
        cx.conectar();
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
    
}
