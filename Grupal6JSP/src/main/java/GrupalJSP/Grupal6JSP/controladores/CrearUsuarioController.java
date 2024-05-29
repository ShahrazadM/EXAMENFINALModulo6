package GrupalJSP.Grupal6JSP.controladores;


		import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;

	import GrupalJSP.Grupal6JSP.modelos.entity.Usuario;
	import GrupalJSP.Grupal6JSP.modelos.service.UsuarioService;

	@Controller
	public class CrearUsuarioController {

	    private final UsuarioService usuarioService;

	    @Autowired
	    public CrearUsuarioController(UsuarioService usuarioService) {
	        this.usuarioService = usuarioService;
	    }

	    @GetMapping("/crearusuario")
	    public String mostrarFormularioCreacion(Model model) {
	        model.addAttribute("usuario", new Usuario());
	        return "crearusuario";
	    }

	    @PostMapping("/crearusuario")
	    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
	        usuarioService.create(usuario);
	        return "redirect:/listarusuarios";
	    }
	}
