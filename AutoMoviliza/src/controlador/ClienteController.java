package controlador;

import Bd.Conexion;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Cliente;

public class ClienteController {
    
    Conexion cx;
    public ClienteController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    
    public boolean valdiarRut(String parRut){
        String query = "SELECT * FROM cliente WHERE rut = '" + parRut + "';";
        boolean validador = false;
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                validador = true;
            }
        } catch (Exception e) {
            System.out.println("Error de validar Rut " + e.getMessage());
        }
        return validador;
    }
    
    public Cliente buscarClientePorRut(String parRut){
        Cliente clienteEncontrado = null;
        String query = "SELECT * FROM cliente WHERE rut = '" + parRut + "';";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                clienteEncontrado = new Cliente(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getInt("numeroContacto"),
                        rs.getString("direccion"),
                        rs.getString("tipoCliente")
                );
            }
        } catch (Exception e) {
            System.out.println("Error buscar cliente por rut " + e.getMessage());
        }
        return  clienteEncontrado;
    }
    

    public void agregarCliente(String parRut,String parNombre,int parNum,String parDireccion,String parTipoCliente){
        String query = "INSERT INTO cliente VALUES(?,?,?,?,?);";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parRut);
            ps.setString(2, parNombre);
            ps.setInt(3, parNum);
            ps.setString(4, parDireccion);
            ps.setString(5, parTipoCliente);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error de agregar Cliente " + e.getMessage());
        }
    }
    
    public void eliminarCliente(String parRut){
        String query = "DELETE FROM cliente WHERE rut = ?";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parRut);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error eliminar cliente");
        }
    }
    
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
       String query = "SELECT * FROM cliente";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                clientes.add(new Cliente(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getInt("NumeroContacto"),
                        rs.getString("direccion"),
                        rs.getString("tipoCliente")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error de obtener Clientes " + e.getMessage());
        }
        return  clientes;
    }


    public List<Cliente> obtenerClientesFiltro(String parNombre){
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM cliente WHERE nombre = '" + parNombre + "';";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                clientes.add(new Cliente(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getInt("NumeroContacto"),
                        rs.getString("direccion"),
                        rs.getString("tipoCliente")
                ));                
            }
        } catch (Exception e) {
            System.out.println("Error obtener Clientes por filtro " + e.getMessage());
        }
        return clientes;
    }
    
    
    public void modificarCliente(String parRut, String parNombre, int parNum, String parDir, String tipoCliente){
        String query = "UPDATE cliente SET nombre = ?, numeroContacto = ?, direccion = ?,tipoCliente = ? WHERE rut = ?;";
        
        try {
            PreparedStatement ps = cx.getConnection().prepareStatement(query);
            ps.setString(1, parNombre);
            ps.setInt(2, parNum);
            ps.setString(3, parDir);
            ps.setString(4, tipoCliente);
            ps.setString(5, parRut);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error modificar Cliente " + e.getMessage());
        }
    }
    
    
    
}
