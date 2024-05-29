package GrupalJSP.Grupal6JSP.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import GrupalJSP.Grupal6JSP.modelos.service.UsuarioService;
import GrupalJSP.Grupal6JSP.modelos.entity.Usuario;



	@Controller
	public class ListarUsuariosController {
		
		@Autowired
		private UsuarioService usu;
		
		@RequestMapping(path = "/listarusuarios", method = RequestMethod.GET)
	    public ModelAndView mostrarusuarios() {		
			List<Usuario> usuarios = usu.getAll();		
			
	        return new ModelAndView("listarusuarios", "usuarios", usuarios);
	    }

	}
