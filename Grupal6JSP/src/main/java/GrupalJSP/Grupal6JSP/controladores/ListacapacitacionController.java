package GrupalJSP.Grupal6JSP.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import GrupalJSP.Grupal6JSP.modelos.entity.Capacitaciones;
//import javitascl.GrupalN5.Model.Service.CapacitacionService;
import GrupalJSP.Grupal6JSP.modelos.service.CapacitacionService;


@Controller
public class ListacapacitacionController {
	
	@Autowired
	private CapacitacionService cs;
	
	@RequestMapping(value = "/listarcapacitacion", method = RequestMethod.GET)
    public ModelAndView mostrarlistaCapacitaciones() {		
		List<Capacitaciones> capacitaciones = cs.getAll();		
		
        return new ModelAndView("listarcapacitacion", "capacitaciones", capacitaciones);
    }

}
