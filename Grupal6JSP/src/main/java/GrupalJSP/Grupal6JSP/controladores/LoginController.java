package GrupalJSP.Grupal6JSP.controladores;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping (value="/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}


	@RequestMapping (value="/error")
	public ModelAndView errorLogin() {
		return new ModelAndView("login", "error", "true");
	}

	@RequestMapping(value="/logout")
	public ModelAndView logout() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return new ModelAndView("redirect:/login?logout"); // 
	}
}
