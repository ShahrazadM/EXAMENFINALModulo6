<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detalles del Administrativo</title>
</head>
<body>
    <h1>Detalles del Administrativo</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Área</th>
            <th>Experiencia</th>
            <th>Clave</th>
        </tr>
        <tr>
            <td>${administrativo.id}</td>
            <td>${administrativo.area}</td>
            <td>${administrativo.experiencia}</td>
            <td>${administrativo.clave}</td>
        </tr>
    </table>
</body>
</html>