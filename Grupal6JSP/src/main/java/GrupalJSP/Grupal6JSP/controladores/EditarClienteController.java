package GrupalJSP.Grupal6JSP.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import GrupalJSP.Grupal6JSP.modelos.entity.Cliente;
import GrupalJSP.Grupal6JSP.modelos.service.ClienteService;


	@Controller
	public class EditarClienteController {
	    
	    @Autowired
	    private ClienteService clienteService;

	    @GetMapping("/listaparaeditaridCLIE")
	    public String mostrarListaClientes(Model model) {
	        model.addAttribute("cliente", clienteService.getAll());
	        return "listaparaeditaridCLIE";
	    }

	    @GetMapping("/editarcliente")
	    public String mostrarFormularioEditarCliente(@RequestParam("id") int id, Model model) {
	        Cliente cliente = clienteService.getOne(id);
	        model.addAttribute("cliente", cliente);
	        return "editarcliente";
	    }

	    @PostMapping("/editarcliente")
	    public String editarCliente(@ModelAttribute("cliente") Cliente cliente) {
	        clienteService.update(cliente);
	        // Redirigir a la lista de administrativos después de editar
	        return "redirect:/listaclientes";
	    }
	}