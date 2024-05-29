package GrupalJSP.Grupal6JSP.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import GrupalJSP.Grupal6JSP.modelos.entity.Listapagos;
import GrupalJSP.Grupal6JSP.modelos.service.PagosService;

@Controller
public class ListaPagosController {
	
	@Autowired
	private PagosService ps;
	
	@RequestMapping(value = "/listarpagos", method = RequestMethod.GET)
    public ModelAndView mostrarlistaPagos() {		
		List<Listapagos> pagos = ps.getAll();		
		
        return new ModelAndView("listarpagos", "listapagos", pagos);
    }

}
