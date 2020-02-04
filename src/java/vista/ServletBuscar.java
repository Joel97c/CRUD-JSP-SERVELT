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

@WebServlet(name = "ServletBuscar", urlPatterns = {"/ServletBuscar"})
public class ServletBuscar extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ServletBuscar() {
    }

 
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String cedula=request.getParameter("cedula");

    BeanUsuario busuario=Usuario.ConsultarUsuario(cedula);
  if(busuario!=null ){
   
   
          request.setAttribute("busuario",busuario);
    request.getRequestDispatcher("datos.jsp").forward(request, response);
   }else{
      
    PrintWriter out=response.getWriter();
    out.println("error en parametros");
   }
    }
 
  }
 
