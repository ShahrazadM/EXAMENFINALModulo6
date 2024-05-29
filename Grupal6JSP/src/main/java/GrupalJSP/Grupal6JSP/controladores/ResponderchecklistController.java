package GrupalJSP.Grupal6JSP.controladores;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import GrupalJSP.Grupal6JSP.modelos.entity.listadochequeos;
import GrupalJSP.Grupal6JSP.modelos.service.ChequeosService;

	@Controller
	public class ResponderchecklistController {
	    
	    @Autowired
	    private ChequeosService chequeosService;
	    
	    @GetMapping("/listachequeos")
	    public ModelAndView mostrarListaChequeos() {
	        List<listadochequeos> listadochequeos = chequeosService.getAll();
	        return new ModelAndView("listachequeos", "listadochequeos", listadochequeos);
	    }
	}