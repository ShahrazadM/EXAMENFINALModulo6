package GrupalJSP.Grupal6JSP.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import GrupalJSP.Grupal6JSP.modelos.entity.Contacto;
import GrupalJSP.Grupal6JSP.modelos.service.ContactoService;

	@Controller
	public class CrearContactoController {

	    private final ContactoService contactoservice;

	    @Autowired
	    public CrearContactoController(ContactoService contactoservice) {
	        this.contactoservice = contactoservice;
	    }

	    @GetMapping("/crearcontacto")
	    public String mostrarFormularioContacto(Model model) {
	        model.addAttribute("contacto", new Contacto());
	        return "crearcontacto";
	    }

	    @PostMapping("/crearcontacto")
	    public String guardarContacto(@ModelAttribute("contacto") Contacto contacto) {
	        contactoservice.create(contacto);
	        return "redirect:/listarcontacto";
	    }
	}