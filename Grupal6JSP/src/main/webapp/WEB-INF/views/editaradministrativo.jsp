<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Administrativo</title>
    <%@ include file='home.jsp'%>	
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Editar Administrativo</h1>
    <form action="${pageContext.request.contextPath}/editaradministrativo" method="post">
        <input type="hidden" name="id" value="${administrativo.id}" />
        <div class="mb-3">
            <label for="area" class="form-label">Área</label>
            <input type="text" class="form-control" id="area" name="area" value="${administrativo.area}">
        </div>
        <div class="mb-3">
            <label for="experiencia" class="form-label">Experiencia</label>
            <input type="text" class="form-control" id="experiencia" name="experiencia" value="${administrativo.experiencia}">
        </div>
        <div class="mb-3">
            <label for="clave" class="form-label">Clave</label>
            <input type="number" class="form-control" id="clave" name="clave" value="${administrativo.clave}">
        </div>
        <button type="submit" class="btn btn-primary">Guardar Cambios</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>