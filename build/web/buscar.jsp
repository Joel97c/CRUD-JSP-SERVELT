
<%@page import="controlador.BeanUsuario"%>
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
					<h1><a href="gestion.html">Volver</a>-BUSCAR</h1>
					<nav id="nav">
						
					</nav>
				</header>
        <section id="main" class="container medium">
					<header>
						<h2>Ingrese el numero de cedula a Buscar</h2>
					</header>
					<div class="box">
        	
     
       <form action="ServletBuscar" method="get">
       
           <input type="text" name="cedula" id="cedula" value="" placeholder="Cedula:" />
	
        
                 
                                                <div class="col-6 col-12-mobilep">
         <center>  <input type="submit" value="Continuar" />
            
             <a href="gestion.html" class="button primary">Cancelar</a>             </center>
           </div>
           </form>
    </body>
</html>
