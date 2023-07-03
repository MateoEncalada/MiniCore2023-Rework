package com.minicore.controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minicore.repositry.UsuarioRepository;


@Controller
@RequestMapping("/usuarios") 
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("usuarios", usuarioRepository.findAll());

		return "home";
	}

}
