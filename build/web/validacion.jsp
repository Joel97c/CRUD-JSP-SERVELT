
     <%@ page import ="java.sql.*" %>
<%
    String usuario_empleado = request.getParameter("usuario_empleado");    
    String contraseņa_empleado = request.getParameter("contraseņa_empleado");
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto","postgres","postgres");

    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from registro_empleado where usuario_empleado='" + usuario_empleado+ "' and contraseņa_empleado='" + contraseņa_empleado + "'");
    if (rs.next()) {
        session.setAttribute("userid", usuario_empleado);
         response.sendRedirect("gestion.html");
    } else {
   out.println("Verifique sus datos o contacte a soporte");
    }
%>
    </body>
</html>
