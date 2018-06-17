package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorHome {
	
	@RequestMapping("/index")
	public ModelAndView Index() {
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("index",modelo);
	}
	
}
