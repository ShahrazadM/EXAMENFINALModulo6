<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="GrupalJSP.Grupal6JSP.modelos.entity.Cliente"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

<div class="container">
<%@ include file="home.jsp" %>
    <h1>Lista de Clientes</h1>
    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Rut</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Teléfono</th>
                <th>afp</th>
                <th>Sistemasalud</th>
                <th>Direccion</th>
               <th>Comuna</th>
               <th>Edad</th>
               <th>Clave</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<Cliente> clientes = (List<Cliente>) request.getAttribute("cliente");
            for(Cliente cliente : clientes) {
            %>
            <tr>
                <td><%= cliente.getId() %></td>
                 <td><%= cliente.getRut() %></td>
				<td><%= cliente.getNombres() %></td>
				<td><%= cliente.getApellidos() %></td>
				<td><%= cliente.getTelefono() %></td>
				<td><%= cliente.getAfp() %></td>
				<td><%= cliente.getSistema_salud() %></td>
				<td><%= cliente.getDireccion() %></td>
				<td><%= cliente.getComuna() %></td>
				<td><%= cliente.getEdad() %></td>
				<td><%= cliente.getClave() %></td>
				
				<td><a href="${pageContext.request.contextPath}/editarcliente?id=<%= cliente.getId() %>">Editar</a></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>