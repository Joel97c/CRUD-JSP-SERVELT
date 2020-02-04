
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
       <link rel="shortcut icon" href="images/logoinicio.png" />
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
        <meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>
        	<header id="header">
					<h1><a href="gestion.html">Volver</a>-ELIMINAR</h1>
					<nav id="nav">
						
					</nav>
				</header>
      <section id="main" class="container medium">
					<header>
						<h2>Ingrese el numero de cedula a eliminar</h2>
						<p>¡Atencion! no se podra recuperar una vez eliminado</p>
					</header>
					<div class="box">
        <form action="ServletEliminar" method="post">
        Cedula:<input type="text" size="20" name="cedula"><br>
            <input type="submit" value="Eliminar">
              <a href="gestion.html"><input type="button" value="Cancelar" name="submit" /></a><center>
 
           

</form>
        <center> 
            
        
            
          
    </body>
</html>
