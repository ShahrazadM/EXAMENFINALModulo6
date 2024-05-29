<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <%@ include file='home.jsp'%>
        <section>
            <h2>Crear Nuevo Usuario</h2>
            <form action="${pageContext.request.contextPath}/crearusuario" method="post">
                <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                </div>
                <div class="mb-3">
                    <label for="fechaNacimiento" class="form-label">Fecha de Nacimiento:</label>

                	<input type="date" class="form-control" id="fechaNacimiento" name="fechaNacimiento" required>
                </div>
                <div class="mb-3">
                    <label for="run" class="form-label">Run:</label>
                    <input type="number" class="form-control" id="run" name="run" required>
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
        </section>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>