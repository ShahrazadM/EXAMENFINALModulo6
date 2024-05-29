package GrupalJSP.Grupal6JSP.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import GrupalJSP.Grupal6JSP.modelos.entity.Contacto;
import GrupalJSP.Grupal6JSP.modelos.service.ContactoService;

	@Controller
	public class ListarContactoController {
		
		@Autowired
		private ContactoService conts;
		
		@RequestMapping(value = "/listarcontacto", method = RequestMethod.GET)
	    public ModelAndView mostrarlistacontacto() {		
			List<Contacto> contactos = conts.getAll();		
			
	        return new ModelAndView("listarcontacto", "contacto", contactos);
	    }

	}