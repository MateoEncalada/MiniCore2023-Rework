package com.minicore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minicore.repositry.VentaRepository;



@Controller
@RequestMapping("/ventas") 
public class VentaController {
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("ventas", ventaRepository.findAll());

		return "home";
	}

}
