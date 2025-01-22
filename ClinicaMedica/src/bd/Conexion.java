package Bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    String bd = "clinicamedica";
    String url = "jdbc:mysql://localhost:3306/" + bd;
    String user = "root";
    String pass = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    
    Connection cx;
    
    
    
    public void conectar() {
    try {
      Class.forName(driver);
      cx = DriverManager.getConnection(url, user, pass);
      System.out.println("Conexión exitosa");
    }catch (ClassNotFoundException | SQLException e) {
      System.out.println("Error de conexión: " + e.getMessage());
    }

   }





  public void desconectar(){
    try {
      cx.close();
      System.out.println("Desconexión exitosa");
    } catch (Exception e) {
      System.out.println("Error desconectando de la BD: - " + e.getMessage());
    }

  }







  public ResultSet EjecutarQuery(String query) throws SQLException {
      Statement st = cx.createStatement();
      return st.executeQuery(query);

  }

   



   

  public Connection getConnection(){
    return cx;
  }

   
    
}
