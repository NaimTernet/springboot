package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//A anotação @RestControlle é a anotação basica que identifica um controller


@RestController
public class HelloController {

	// Quando acessar o browser via porta 8080 | localhost:8080
	// para retornar atraves do browser, é necessario a anotação @GetMappin + o
	// caminho conforme abaixo

	@GetMapping("/")
	public String HelloMessage() {
		return "Hello, Digital Innovation One!";
	}
}
