<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="GrupalJSP.Grupal6JSP.modelos.entity.Visitaterreno" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Visitas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

    <div class="container">
        <%@ include file='home.jsp'%>   
        <section>
            <h1>Listado de Visitas</h1>
            <table class="table">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>RUT Cliente</th>
                        <th>Día</th>
                        <th>Hora</th>
                        <th>Lugar</th>
                        <th>Comentarios</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                    List<Visitaterreno> visitas = (List<Visitaterreno>) request.getAttribute("visitaterreno");
                    for (Visitaterreno vis : visitas) {
                    %>
                    <tr>
                        <td><%= vis.getId() %></td>
                        <td><%= vis.getRutCliente() %></td>
                        <td><%= vis.getDia() %></td>
                        <td><%= vis.getHora() %></td>
                        <td><%= vis.getLugar() %></td>
                        <td><%= vis.getComentarios() %></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </section>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
</body>
</html>