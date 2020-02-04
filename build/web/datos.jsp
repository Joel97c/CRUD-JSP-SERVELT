<%-- 
    Document   : datos
    Created on : 23/03/2019, 19:14:02
    Author     : welli
--%>

<%@page import="controlador.BeanUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="shortcut icon" href="images/logoinicio.png" />
    <head>
    <link rel="stylesheet" href="assets/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta Usuario</title>


</head>

    <body>
        <header id="header">
					<h1><a href="gestion.html">Volver</a>-Encontrado</h1>
					<nav id="nav">
						
					</nav>
				</header>
      <section id="main" class="container medium">
					<header>
						<h2>Busqueda-Exitosa</h2>
						<p>¡Atencion! Si no visualiza comuniquese al departamento de soporte</p>
					</header>
        	
        
            <%BeanUsuario busuario=(BeanUsuario)request.getAttribute("busuario"); %>

							<div class="row gtr-50 gtr-uniform">
                                                            
								
                                                            <div class="col-6 col-12-mobilep">
                                                                Cedula<input type="text" name="codigo" id="nombre" value="<%= busuario.getCedula()%>"  readonly="readonly"/>
                                                                        </div>
                                                                     <div class="col-6 col-12-mobilep">
                                                                       Usuario:<input type="text" name="usuario" id="nombre" value="<%= busuario.getUsuario()%>"  readonly="readonly"/>
                                                                        </div>
                                                         <div class="col-6 col-12-mobilep">
								Fecha Trabajo:<input type="text" name="contraseña" id="apellido" value="<%= busuario.getFechain()%>" readonly="readonly"/>
                                                              </div>
                                                                <div class="col-6 col-12-mobilep">
                                                               Direccion<input type="text" name="direccion" id="edad" value="<%= busuario.getDireccion()%>" readonly="readonly"/>
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                               Cargo:<input type="text" name="fechain" id="telefono" value="<%= busuario.getContraseña()%>"  readonly="readonly"/>
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                Hora registrado<input type="text" name="id_cargo" id="correo" value="<%= busuario.getId_cargo()%>"  readonly="readonly"/>
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                Hora de entrada:<input type="text" name="id_horario" id="genero" value="<%= busuario.getId_horario()%>" readonly="readonly"/>
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                            Hora de salida:<input type="text" name="cedula" id="especialidad" value="<%= busuario.getCodigo()%>"  readonly="readonly"/>
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                
							
								
									
			
								</div>
							
						</form>
                                                  <center><a href="gestion.html" class="button primary">ok</a><center>
    </body>
</html>
