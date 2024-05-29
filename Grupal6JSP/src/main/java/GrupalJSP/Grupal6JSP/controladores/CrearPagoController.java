package GrupalJSP.Grupal6JSP.controladores;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import GrupalJSP.Grupal6JSP.modelos.entity.Listapagos;
import GrupalJSP.Grupal6JSP.modelos.service.PagosService;

@Controller
public class CrearPagoController {

    private final PagosService pagoservice;

    @Autowired
    public CrearPagoController(PagosService pagoservice) {
        this.pagoservice = pagoservice;
    }

    @GetMapping("/crearpago")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("listapagos", new PagosService());
        return "crearpago";
    }

    @PostMapping("/crearpago")
    public String guardarUsuario(@ModelAttribute("listapagos") Listapagos listpag) {
    	pagoservice.create(listpag);
        return "redirect:/listapagos";
    }
}
