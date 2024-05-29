<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="GrupalJSP.Grupal6JSP.modelos.entity.Contacto"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Contactos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <%@ include file='home.jsp'%>
        <section>
            <h1>Lista de Contactos</h1>
            <table class="table">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Email</th>
                        <th>Asunto</th>
                        <th>Mensaje</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Contacto> contactos = (List<Contacto>)request.getAttribute("contacto");
                    for(Contacto contacto : contactos) { %>
                        <tr>
                            <td><%= contacto.getId() %></td>
                            <td><%= contacto.getNombre() %></td>
                            <td><%= contacto.getEmail() %></td>
                            <td><%= contacto.getAsunto() %></td>
                            <td><%= contacto.getMensaje() %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        </section>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
</body>
</html>