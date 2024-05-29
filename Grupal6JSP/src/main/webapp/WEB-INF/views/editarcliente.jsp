<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Cliente</title>
    <%@ include file='home.jsp'%>	
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Editar Cliente</h1>
    <form action="${pageContext.request.contextPath}/editarcliente" method="post">
        <input type="hidden" name="id" value="${cliente.id}" />
        
        <div class="mb-3">
		    <label for="rut" class="form-label">RUT</label>
		    <input type="text" class="form-control" id="rut" name="rut" value="${cliente.rut}" readonly>
		</div>

	     <div class="mb-3">
	    <label for="nombres" class="form-label">Nombres</label>
	    <input type="text" class="form-control" id="nombres" name="nombres" value="${cliente.nombres}" readonly>
		</div>
	
		<div class="mb-3">
		    <label for="apellidos" class="form-label">Apellidos</label>
		    <input type="text" class="form-control" id="apellidos" name="apellidos" value="${cliente.apellidos}" readonly>
		</div>
        <div class="mb-3">
            <label for="telefono" class="form-label">Teléfono</label>
            <input type="text" class="form-control" id="telefono" name="telefono" value="${cliente.telefono}">
        </div>

        <div class="mb-3">
            <label for="afp" class="form-label">AFP</label>
            <input type="text" class="form-control" id="afp" name="afp" value="${cliente.afp}">
        </div>

        <div class="mb-3">
            <label for="sistema_salud" class="form-label">Sistema de Salud</label>
            <input type="text" class="form-control" id="sistema_salud" name="sistema_salud" value="${cliente.sistema_salud}">
        </div>

        <div class="mb-3">
            <label for="direccion" class="form-label">Dirección</label>
            <input type="text" class="form-control" id="direccion" name="direccion" value="${cliente.direccion}">
        </div>

        <div class="mb-3">
            <label for="comuna" class="form-label">Comuna</label>
            <input type="text" class="form-control" id="comuna" name="comuna" value="${cliente.comuna}">
        </div>

        <div class="mb-3">
            <label for="edad" class="form-label">Edad</label>
            <input type="text" class="form-control" id="edad" name="edad" value="${cliente.edad}">
        </div>

        <div class="mb-3">
            <label for="clave" class="form-label">Clave</label>
            <input type="text" class="form-control" id="clave" name="clave" value="${cliente.clave}">
        </div>

        <button type="submit" class="btn btn-primary">Guardar Cambios</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>