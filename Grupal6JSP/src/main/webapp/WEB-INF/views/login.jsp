<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Configuración inicial de ancho y escala -->
    <!--<meta name="viewport" content="width=device-width, initial-scale=1.0">-->
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container" style="display: flex; flex-direction: column; align-items: center;">
        <form class="form-signin" method="post" action="<c:url value='/login' />" style="width: 300px; margin-top: 20px;">
            <c:if test="${not empty error}">
                <h2 class="alert alert-danger">Error de Autenticación</h2>
            </c:if>
            <h2 class="form-signin-heading">Login</h2>
            <p>
                <input type="text" id="username" name="username" class="form-control" placeholder="username" required="" autofocus="">
            </p>
            <p>
                <input type="password" id="password" name="password" class="form-control" placeholder="password" required="">
            </p>
            <input name="_csrf" type="hidden" value="ca6e67f7-f585-4240-bb67-87fd4f13c651">
            <button class="btn btn-lg btn-danger btn-block" type="submit" style="width: 100%;">Ingresar</button>
        </form>
    </div>
</body>
</html>