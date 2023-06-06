package com.rojeto.primeirospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Comandos {

	@GetMapping("/msg")
	public String mensagem() {
		return "Olá! Seja Bem Vindo!";
	}
	
	@GetMapping("/produtos")
	public List<String> produtos(){
		List<String> lst = new ArrayList<>();
		lst.add("Mouse");
		lst.add("Teclado");
		lst.add("Monitor");
		lst.add("SSD 480");
		return lst;
	}
	
	
}
