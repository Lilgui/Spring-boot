package com.atv1spring.hellowolrd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/at1spring")
public class Atv1Controller {

	@GetMapping
	public String habs(){
		return "Usei muita atenção aos detalhes e persistência";	
	}
}
