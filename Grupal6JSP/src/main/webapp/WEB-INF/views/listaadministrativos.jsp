<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="GrupalJSP.Grupal6JSP.modelos.entity.Administrativo"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de Administrativos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <%@ include file='home.jsp'%>
        <section>
            <h1>Administrativos</h1>
            <table class="table">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Área</th>
                        <th>Experiencia</th>
                        <th>Clave</th>
                    </tr>			
                </thead>
                <tbody>
                    <% 
                    List<Administrativo> administrativos = (List<Administrativo>) request.getAttribute("administrativo");
                    for(Administrativo admin : administrativos) {
                    %>
                    <tr>
                        <td><%= admin.getId() %></td>
                        <td><%= admin.getArea() %></td>
                        <td><%= admin.getExperiencia() %></td>
                        <td><%= admin.getClave() %></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </section>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>