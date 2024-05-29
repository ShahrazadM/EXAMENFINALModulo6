<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <!-- Cabeceras -->
    <head>
        <!-- Codificación de Caracteres -->
        <meta charset="UTF-8">

        <!-- Configuración de ancho y escala inicial para los dispositivos -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Título -->
        <title>Grupal6</title>

        <!-- Hojas de estilo -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/estilo.css">
    </head>
    <!-- /Cabeceras -->

    <!-- Contenido -->
    <body>
        <div class="container">	
        	<h2>PREVENSION 2.0 SOCIEDAD LIMITADA</h2> 
        <p>En nuestro portal encontrarás información relevante sobre prevención de riesgos en tu empresa.</p>
        <p>Puedes comenzar explorando nuestras capacitaciones, contactándonos para más información o creando una nueva capacitación.</p>
        
			<%@ include file='mimenu.jsp'%>
			
		</div>
		
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
    </body>
    <!-- /Contenido -->
</html>
