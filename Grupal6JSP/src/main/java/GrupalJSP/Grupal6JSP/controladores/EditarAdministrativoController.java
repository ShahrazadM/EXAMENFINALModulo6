package GrupalJSP.Grupal6JSP.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import GrupalJSP.Grupal6JSP.modelos.entity.Administrativo;
import GrupalJSP.Grupal6JSP.modelos.service.AdministrativoService;

@Controller
public class EditarAdministrativoController {
    
    @Autowired
    private AdministrativoService administrativoService;

    @GetMapping("/listaparaeditaridADMI")
    public String mostrarListaAdministrativos(Model model) {
        model.addAttribute("administrativos", administrativoService.getAll());
        return "listaparaeditaridADMI";
    }

    @GetMapping("/editaradministrativo")
    public String mostrarFormularioEditarAdministrativo(@RequestParam("id") int id, Model model) {
        Administrativo administrativo = administrativoService.getOne(id);
        model.addAttribute("administrativo", administrativo);
        return "editaradministrativo";
    }

    @PostMapping("/editaradministrativo")
    public String editarAdministrativo(@ModelAttribute("administrativo") Administrativo administrativo) {
        administrativoService.update(administrativo);
        // Redirigir a la lista de administrativos después de editar
        return "redirect:/listaadministrativos";
    }
}