<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Pago</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <%@ include file='home.jsp'%>
        <section>
            <h1>Crear Pago</h1>
            <form action="crearpago" method="POST">
                <div class="mb-3">
                    <label for="rutCliente" class="form-label">RUT Cliente</label>
                    <input type="text" class="form-control" id="rutCliente" name="rutCliente" required>
                </div>
                <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                </div>
                <div class="mb-3">
                    <label for="apellido" class="form-label">Apellido</label>
                    <input type="text" class="form-control" id="apellido" name="apellido" required>
                </div>
                <div class="mb-3">
                    <label for="numeroCuotas" class="form-label">Número de Cuotas</label>
                    <input type="number" class="form-control" id="numeroCuotas" name="numeroCuotas" required>
                </div>
                <div class="mb-3">
                    <label for="montoPago" class="form-label">Monto de Pago</label>
                    <input type="number" class="form-control" id="montoPago" name="montoPago" required>
                </div>
                <button type="submit" class="btn btn-primary">Crear Pago</button>
            </form>
        </section>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
</body>
</html>