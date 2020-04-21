package com.br.pcsemdor.mercadonamao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Main {

	
	@GetMapping
	public String teste() {
		return "Vitor";
	}
	
}
