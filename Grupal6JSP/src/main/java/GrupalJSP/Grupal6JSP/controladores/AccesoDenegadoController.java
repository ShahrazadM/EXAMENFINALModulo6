package GrupalJSP.Grupal6JSP.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccesoDenegadoController {

    @GetMapping("/accesodenegado")
    public String mostrarPaginaAccesoDenegado() {
        return "accesodenegado"; // Nombre de la página JSP sin la extensión .jsp
    }
}