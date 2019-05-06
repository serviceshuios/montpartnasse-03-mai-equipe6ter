package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class RoutiereController {

	@Autowired
	private Iservice service;

	@RequestMapping(value = "/indexRoutiere", method = RequestMethod.GET)
	public String lister(Model model) {
		model.addAttribute("routiere", new Routiere());
		model.addAttribute("routieres", service.findAllRoutiere());
		return "routieres";

	}

	@RequestMapping(value = "/saveRoutiere")
	public String save(Routiere routiere, Model model) {
		if (routiere.getIdCargaison() == 0) {
			service.ajouterRoutiere(routiere);
			model.addAttribute("routiere", new Routiere());
			model.addAttribute("routieres", service.findAllRoutiere());
			return "routieres";
		} else {
			service.modifierRoutiere(routiere);
			model.addAttribute("routiere", new Routiere());
			model.addAttribute("routieres", service.findAllRoutiere());
			return "routieres";
		}
	}

	@RequestMapping(value = "/deleteRoutiere")
	public String delete(@RequestParam int idCargaison, Model model) {
		service.supprimerRoutiere(idCargaison);
		model.addAttribute("routiere", new Routiere());
		model.addAttribute("routieres", service.findAllRoutiere());
		return "routieres";
	}

	@RequestMapping(value = "/editRoutiere")
	public String edit(@RequestParam int idCargaison, Model model) {
		model.addAttribute("routiere", service.getRoutiere(idCargaison));
		model.addAttribute("routieres", service.findAllRoutiere());
		return "routieres";
	}

}
