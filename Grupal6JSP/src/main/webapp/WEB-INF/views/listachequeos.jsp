<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="GrupalJSP.Grupal6JSP.modelos.entity.listadochequeos" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Chequeos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <%@ include file="home.jsp" %>
    <section>
        <h1>Listado de Chequeos</h1>
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>ID de Visita</th>
                    <th>Fecha de Chequeo</th>
                    <th>Hora de Chequeo</th>
                    <th>Resultado</th>
                    <th>Observaciones</th>
                </tr>
            </thead>
            <tbody>
                <% 
                List<listadochequeos> chequeos = (List<listadochequeos>) request.getAttribute("listadochequeos");
                for (listadochequeos chequeo : chequeos) {
                %>
                <tr>
                    <td><%= chequeo.getId() %></td>
                    <td><%= chequeo.getIdVisita() %></td>
                    <td><%= chequeo.getFechaChequeo() %></td>
                    <td><%= chequeo.getHoraChequeo() %></td>
                    <td><%= chequeo.getResultado() %></td>
                    <td><%= chequeo.getObservaciones() %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </section>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>