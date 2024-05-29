package GrupalJSP.Grupal6JSP.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import GrupalJSP.Grupal6JSP.modelos.entity.Visitaterreno;
import GrupalJSP.Grupal6JSP.modelos.service.VisitaService;

@Controller
public class ListadoVisitasController {

    @Autowired
    private VisitaService vis;

    @RequestMapping(value = "/listadovisitas", method = RequestMethod.GET)
    public ModelAndView mostrarlistaVisitas() {		
        List<Visitaterreno> visitaterreno = vis.getAll();		
        return new ModelAndView("listadovisitas", "visitaterreno", visitaterreno);
    }
}
