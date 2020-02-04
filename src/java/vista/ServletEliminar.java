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

@WebServlet(name = "ServletEliminar", urlPatterns = {"/ServletEliminar"})
public class ServletEliminar extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ServletEliminar() {
    }

 
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String cedula=request.getParameter("cedula");

    BeanUsuario busuario=Usuario.EliminarUsuario(cedula);
  if(busuario!=null ){
   
   
          request.setAttribute("busuario",busuario);
    request.getRequestDispatcher("eliminar.jsp").forward(request, response);
   }else{
      
    PrintWriter out=response.getWriter();
       request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
    

  }
 }
}
