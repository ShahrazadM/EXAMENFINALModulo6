package GrupalJSP.Grupal6JSP.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

    @GetMapping("/empresa")
    public String mostrarEmpresa() {
        return "empresa";
    }
}