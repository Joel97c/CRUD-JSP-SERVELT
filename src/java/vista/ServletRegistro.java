package vista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

import controlador.BeanUsuario;

@WebServlet(name = "ServletRegistro", urlPatterns = {"/ServletRegistro"})
public class ServletRegistro extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ServletRegistro() {
    }

 
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String codigo=request.getParameter("codigo");   
  String usuario=request.getParameter("usuario");
          String contraseña=request.getParameter("contraseña");
   String cedula=request.getParameter("cedula");
  String direccion=request.getParameter("direccion");
  String fechain=request.getParameter("fechain");
    String id_cargo=request.getParameter("id_cargo");
      String id_horario=request.getParameter("id_horario");

  
      
  if(!codigo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !contraseña.equalsIgnoreCase("") && !cedula.equalsIgnoreCase("") && !direccion.equalsIgnoreCase("")
          && !fechain.equalsIgnoreCase("")  && !id_cargo.equalsIgnoreCase("")  && !id_horario.equalsIgnoreCase("")){
   BeanUsuario busuario=new BeanUsuario(codigo, usuario, contraseña,cedula, direccion, fechain,id_cargo,id_horario);
   boolean sw=Usuario.agregarUsuario(busuario);
   if(sw){
    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Error en paramatros by:Willy");
   }
  }
 }
}
 