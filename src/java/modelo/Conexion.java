package modelo;
import java.sql.*;

public class Conexion {

 private Connection con = null;

 public Conexion() {
  try {
   Class.forName("org.postgresql.Driver").newInstance();
   con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto","postgres","postgres");
  } catch (InstantiationException | IllegalAccessException
    | ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
e.printStackTrace();
  }
 }
 
 public Connection getConexion(){
  return con;
 }
 
 public void cerrarConexion(){
  try {
   con.close();
  } catch (SQLException e) {
  }
 }
}