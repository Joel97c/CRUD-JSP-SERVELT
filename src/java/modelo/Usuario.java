package modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.BeanUsuario;
import java.sql.ResultSet;

public class Usuario {
 
 public static boolean agregarUsuario(BeanUsuario usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    st.executeUpdate("INSERT INTO registro_empleado(cod_empleado,usuario_empleado,contraseña_empleado,cedula,direccion,fecha_ingreso,id_cargo,id_horario) VALUES ('"+usuario.getCodigo()+"','"+usuario.getUsuario()+"','"+usuario.getContraseña()+"',"+usuario.getCedula()+",'"+usuario.getDireccion()+"','"+usuario.getFechain()+"','"+usuario.getId_cargo()+"','"+usuario.getId_horario()+"')");
    agregado=true;
    st.close();
   }
   c.cerrarConexion();
  } catch (SQLException e) {
   agregado=false;
  }
  return agregado;
 }
  public static BeanUsuario ConsultarUsuario(String cedula){
  BeanUsuario busuario=null;
  try{
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from registro_e_s join horario on registro_e_s.cod_registroe=horario.cod_registroe join registro_empleado on registro_empleado.id_horario=horario.id_horario join cargo on cargo.id_cargo=registro_empleado.id_cargo where cedula='"+cedula+"'");
   while(rs.next()){
   busuario=new BeanUsuario(rs.getString(4),rs.getString(10),rs.getString(18),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(7),rs.getString(3));
   }
   rs.close();
   st.close();
  }catch(SQLException se){
   se.printStackTrace();
  }
  return busuario;
 }


  public static boolean ActulizarUsuario(BeanUsuario usuario){
  boolean actualizado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    
    st.executeUpdate("UPDATE registro_empleado SET usuario_empleado='"+usuario.getUsuario()+"',contraseña_empleado='"+usuario.getContraseña()+"',direccion='"+usuario.getDireccion()+"' where cedula="+usuario.getCedula()+"");
    actualizado=true;
    st.close();
   }
   c.cerrarConexion();
  } catch (SQLException e) {
   actualizado=false;
  }
  return actualizado;
 }
  

  
   public static BeanUsuario EliminarUsuario(String cedula){
  BeanUsuario busuario=null;
  try{
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("delete from registro_empleado where cedula='"+cedula+"'");
   
   rs.close();
   st.close();
  }catch(SQLException se){
   se.printStackTrace();
  }
  return busuario;
 }
  
}