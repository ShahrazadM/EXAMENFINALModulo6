<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="GrupalJSP.Grupal6JSP.modelos.entity.Listapagos"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Pagos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <%@ include file='home.jsp'%>
        <section>
            <h1>Lista de Pagos</h1>
            <table class="table">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>RUT Cliente</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Número de Cuotas</th>
                        <th>Monto de Pago</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Listapagos> listapagos = (List<Listapagos>)request.getAttribute("listapagos");
                    for(Listapagos pago : listapagos) { %>
                        <tr>
                        	<td><%= pago.getId() %></td>
                            <td><%= pago.getRutCliente() %></td>
                            <td><%= pago.getNombre() %></td>
                            <td><%= pago.getApellido() %></td>
                            <td><%= pago.getNumeroCuotas() %></td>
                            <td><%= pago.getMontoPago() %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        </section>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
</body>
</html>