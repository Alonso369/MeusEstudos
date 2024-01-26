package br.com.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController            //Essa classe é uma classe Controller
@RequestMapping("/hello")  //Se chegar alguma requisição para ("/hello") e 
                           // Ela for do tipo GET, então chame o método olaMundo()
public class HelloController {
	
	@GetMapping //identificando o método
	public String olaMundo() {
		return "Hello World Spring Boot!";
	}
	
}
