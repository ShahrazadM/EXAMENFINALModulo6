<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Capacitación</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <%@ include file='home.jsp'%>
        <section>
            <h1>Crear Capacitación</h1>
            <form action="crearcapacitacion" method="POST">
                <div class="mb-3">
                    <label for="rutCliente" class="form-label">RUT Cliente</label>
                    <input type="number" class="form-control" id="rutCliente" name="rutCliente" required>
                </div>
                <div class="mb-3">
                    <label for="dia" class="form-label">Día</label>
                    <input type="date" class="form-control" id="dia" name="dia" required>
                </div>
                <div class="mb-3">
                    <label for="hora" class="form-label">Hora</label>
                    <input type="time" class="form-control" id="hora" name="hora" required>
                </div>
                <div class="mb-3">
                    <label for="lugar" class="form-label">Lugar</label>
                    <input type="text" class="form-control" id="lugar" name="lugar" required>
                </div>
                <div class="mb-3">
                    <label for="duracion" class="form-label">Duración</label>
                    <input type="text" class="form-control" id="duracion" name="duracion" required>
                </div>
                <div class="mb-3">
                    <label for="cantidadAsistentes" class="form-label">Cantidad de Asistentes</label>
                    <input type="number" class="form-control" id="cantidadAsistentes" name="cantidadAsistentes" required>
                </div>
                <button type="submit" class="btn btn-primary">Crear Capacitación</button>
            </form>
        </section>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
</body>
</html>