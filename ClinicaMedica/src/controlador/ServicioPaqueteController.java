/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import modelo.ServicioPaquete;

/**
 *
 * @author vicen
 */
public class ServicioPaqueteController {

    Conexion cx;
    
    public ServicioPaqueteController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    
    //CRUD
    public List<ServicioPaquete> obtenerServicioPaquete(){
        List<ServicioPaquete> paquetes = new ArrayList<>();
        String query = "SELECT * FROM servicioPaquete";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                paquetes.add(new ServicioPaquete(
                        rs.getString("codigoPaquete"),
                        rs.getString("codigoServicio")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error obtener Servicios del paquete " + e.getMessage());
        }
        return paquetes;
    }
    
    
}
