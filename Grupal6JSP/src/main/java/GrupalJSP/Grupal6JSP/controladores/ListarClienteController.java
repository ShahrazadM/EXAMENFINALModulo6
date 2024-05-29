package GrupalJSP.Grupal6JSP.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import GrupalJSP.Grupal6JSP.modelos.entity.Cliente;
import GrupalJSP.Grupal6JSP.modelos.service.ClienteService;


	@Controller
    public class ListarClienteController {
        
        @Autowired
        private ClienteService cliser;

        @RequestMapping(value = "/listaclientes", method = RequestMethod.GET)
        public ModelAndView mostrarlistaclientes() {
            List<Cliente> cliente = cliser.getAll();
            return new ModelAndView("listaclientes", "cliente", cliente);
        }
}
