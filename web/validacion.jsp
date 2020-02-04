
     <%@ page import ="java.sql.*" %>
<%
    String usuario_empleado = request.getParameter("usuario_empleado");    
    String contraseña_empleado = request.getParameter("contraseña_empleado");
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto","postgres","postgres");

    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from registro_empleado where usuario_empleado='" + usuario_empleado+ "' and contraseña_empleado='" + contraseña_empleado + "'");
    if (rs.next()) {
        session.setAttribute("userid", usuario_empleado);
         response.sendRedirect("gestion.html");
    } else {
   out.println("Verifique sus datos o contacte a soporte");
    }
%>
    </body>
</html>
