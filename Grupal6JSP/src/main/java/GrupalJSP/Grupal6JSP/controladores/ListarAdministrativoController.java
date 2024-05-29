package GrupalJSP.Grupal6JSP.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import GrupalJSP.Grupal6JSP.modelos.entity.Administrativo;

import GrupalJSP.Grupal6JSP.modelos.service.AdministrativoService;

@Controller
	    public class ListarAdministrativoController {
	        
	        @Autowired
	        private AdministrativoService ads;

	        @RequestMapping(value = "/listaadministrativos", method = RequestMethod.GET)
	        public ModelAndView mostrarlistaAdministrativos() {
	            List<Administrativo> administrativo = ads.getAll();
	            return new ModelAndView("listaadministrativos", "administrativo", administrativo);
	        }
}