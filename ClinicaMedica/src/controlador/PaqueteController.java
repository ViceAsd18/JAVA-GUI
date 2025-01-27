/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.Paquete;

import java.sql.ResultSet;

/*
*
 *
 * @author vicen
 */
public class PaqueteController {
    
    Conexion cx;
    
    public PaqueteController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    //CRUD
    public List<Paquete> obtenerPaquetes(){
        List<Paquete> paquetes = new ArrayList<>();
        String query = "SELECT * FROM paquete";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                paquetes.add(new Paquete(
                        rs.getString("codigoPaquete"),
                        rs.getString("nombrePaquete"),
                        rs.getDouble("precioPaquete")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error obtener paquetes " + e.getMessage());
        }
        return paquetes;
    }
    
    
    
    
}
