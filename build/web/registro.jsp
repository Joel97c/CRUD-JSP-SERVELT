


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <link rel="shortcut icon" href="images/logoinicio.png" />
    <link rel="stylesheet" href="assets/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Usuario</title>
</head>
<body>
	<header id="header">
					<h1><a href="gestion.html">Volver</a>-REGISTRO</h1>
					<nav id="nav">
						
					</nav>
				</header>

        
        
        	<section id="main" class="container medium">
					<header>
						<h2>Registro Nuevo Empleado</h2>
						 <p>¡ATENCION! verifique que los datos sean correctos antes de aceptar</p>
                                               
					</header>
					<div class="box">

						<form action="ServletRegistro" method="post">

							<div class="row gtr-50 gtr-uniform">
                                                            
								<div class="col-6 col-12-mobilep">
									<input type="text" name="codigo" id="codigo" value="" placeholder="Codigo" />
									</div>
                                                            <div class="col-6 col-12-mobilep">
                                                                        <input type="text" name="usuario" id="usuario" value="" placeholder="Usuario:" />
                                                                        </div>
                                                         <div class="col-6 col-12-mobilep">
								<input type="password" name="contraseña" id="contraseña" value="" placeholder="Contraseña:" />
                                                              </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                <input type="text" name="cedula" id="cedula" value="" placeholder="Cedula:" />
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                <input type="text" name="direccion" id="direccion" value="" placeholder="Direccion:" />
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                <input type="text" name="fechain" id="fechain" value="" placeholder="Fecha:" />
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                    <input type="text" name="id_cargo"  title="1:Doctor" id="id_cargo" value="" placeholder="Cargo(1-4)" />
                                                                </div>
                                                                <div class="col-6 col-12-mobilep">
                                                                    <input type="text" name="id_horario" id="id_horario" value="" placeholder="Horario(1-4)" title="" >
                                                                </div>
                                                               
									
							
								
									<ul class="actions special">
										<li><input type="submit" value="Aceptar" /></li>
                                                                                <li> <a href="gestion.html" class="button primary">Cancelar</a></li>
									</ul>
								</div>
							</div>
						</form>
					</div>
				</section>




</body>
</html>