package GrupalJSP.Grupal6JSP.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import GrupalJSP.Grupal6JSP.modelos.entity.Visitaterreno;
import GrupalJSP.Grupal6JSP.modelos.service.VisitaService;

@Controller
public class CrearVisitaController {

    private final VisitaService visitaService;

    @Autowired
    public CrearVisitaController(VisitaService visitaService) {
        this.visitaService = visitaService;
    }

    @GetMapping("/crearvisita")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("visitaterreno", new Visitaterreno());
        return "crearvisita";
    }

    @PostMapping("/crearvisita")
    public String guardarVisita(@ModelAttribute("visitaterreno") Visitaterreno visita) {
        visitaService.create(visita);
        return "redirect:/listadovisitas";
    }
}