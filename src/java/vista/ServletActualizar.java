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

@WebServlet(name = "ServletActualizar", urlPatterns = {"/ServletActualizar"})
public class ServletActualizar extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ServletActualizar() {
    }

 
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String cedula=request.getParameter("cedula");   
  String usuario=request.getParameter("usuario");
          String contraseña=request.getParameter("contraseña");
   
  String direccion=request.getParameter("direccion");


  
      
  if( !cedula.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !contraseña.equalsIgnoreCase("") && !direccion.equalsIgnoreCase("")){
   BeanUsuario busuario=new BeanUsuario(cedula, usuario, contraseña,direccion);
   boolean sw=Usuario.ActulizarUsuario(busuario);
   if(sw){
    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Error en paramatros by:Willy");
   }
  }
 }
}
 