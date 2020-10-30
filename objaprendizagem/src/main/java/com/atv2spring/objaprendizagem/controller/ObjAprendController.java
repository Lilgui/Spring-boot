package com.atv2spring.objaprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atv2spring")
public class ObjAprendController {
	
	@GetMapping
	public String objetivos() {
		return "O meu objetivo de aprendizagem para está semana é aprimorar minha orientação aos detalhes";
	}
}
