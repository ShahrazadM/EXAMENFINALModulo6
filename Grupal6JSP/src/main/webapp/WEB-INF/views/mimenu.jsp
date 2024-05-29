<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="empresa">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="crearcontacto">Contacto</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link" href="crearcapacitacion">Crear Capacitaciones con JPA</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="listarcapacitacion">Lista de Capacitaciones con JPA</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="listarusuarios">Lista de Usuarios con JPA</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="crearusuario">Crear Usuarios con JPA</a>
                </li>
                <li class="nav-item">
         		 <a class="nav-link" href="listaparaeditaridCLIE">Editar Cliente</a>
         		  </li>
                 <li class="nav-item">
         		 <a class="nav-link" href="listaparaeditaridADMI">Editar Administrativo</a>
         		  </li>
         		  
      			  <li class="nav-item">
                    <a class="nav-link" href="crearvisita">CrearVisita</a>
                	</li>
                	 <li class="nav-item">
                    <a class="nav-link" href="listadovisitas">Listavisitas</a>
                	</li>
                	<li class="nav-item">
                    <a class="nav-link" href="listarpagos">ListarPagos</a>
                	</li>
                	<li class="nav-item">
                    <a class="nav-link" href="crearpago">Crear-Pago</a>
                	</li>
                <li class="nav-item">
                    <a class="nav-link" href="listachequeos">Responderchecklist</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link" href="logout">CerrarSecion</a>
                </li>
            </ul>
            
        </div>
    </div>
</nav>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<%--   menú con el script jQuery para la animación de desplazamiento suave agregado:--%>
<script>
    $(document).ready(function(){
        $("a.nav-link").on('click', function(event) {
            if (this.hash !== "") {
                event.preventDefault();
                var hash = this.hash;
                $('html, body').animate({
                    scrollTop: $(hash).offset().top
                }, 800, function(){
                    window.location.hash = hash;
                });
            } 
        });
    });
</script>