package GrupalJSP.Grupal6JSP.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import GrupalJSP.Grupal6JSP.modelos.entity.Capacitaciones;
import GrupalJSP.Grupal6JSP.modelos.service.CapacitacionService;

	@Controller
	public class CrearCapaciatcionController {

	    private final CapacitacionService cs;

	    @Autowired
	    public CrearCapaciatcionController(CapacitacionService cs) {
	        this.cs = cs;
	    }

	    @GetMapping("/crearcapacitacion")
	    public String mostrarFormularioCapacitacion(Model model) {
	        model.addAttribute("capacitaciones", new Capacitaciones());
	        return "crearcapacitacion";
	    }

	    @PostMapping("/crearcapacitacion")
	    public String guardarCapacitacion(@ModelAttribute("capacitaciones") Capacitaciones capacitaciones) {
	        cs.create(capacitaciones);
	        return "redirect:/listarcapaciatcion";
	    }
	}