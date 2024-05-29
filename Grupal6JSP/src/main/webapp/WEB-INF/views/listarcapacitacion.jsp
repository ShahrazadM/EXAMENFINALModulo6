
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="GrupalJSP.Grupal6JSP.modelos.entity.Capacitaciones"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina de Capacitaciones</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		
		<%@ include file='home.jsp'%>	
		<section>
			<h1>Capacitaciones</h1>
			
			<table class="table">
				<thead class="table-dark">
					<tr>
						<th>id</th>
						<th>rutCliente</th>
						<th>dia</th>
						<th>hora</th>
						<th>Lugar</th>
						<th>duracion</th>
						<th>cantidadAsistentes</th>
					</tr>			
				</thead>
				<tbody>
				
					<%
					
					List<Capacitaciones> capacitaciones = (List<Capacitaciones>)request.getAttribute("capacitaciones");
					for(Capacitaciones c : capacitaciones) {
						
						%>
							<tr>
								<td><%=c.getId()%></td>
								<td><%=c.getRutCliente()%></td>
								<td><%=c.getDia()%></td>
								<td><%=c.getHora()%></td>
								<td><%=c.getLugar() %></td>
								<td><%=c.getDuracion()%></td>
								<td><%=c.getCantidadAsistentes() %></td>
							</tr>
						<%
					}
					%>			
				</tbody>		
			</table>		
			
		</section>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
</body>
</html>