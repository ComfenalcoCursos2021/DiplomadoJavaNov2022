package com.echo.service.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.echo.service.dtos.Persona;


@RestController
@RequestMapping("echo")
public class EchoController {

	@GetMapping("saludo")
	public String getSaludo() {
		return "El saludo " +(new Date()).toString();
	}
	@GetMapping("saludoClon")
	public String getSaludoClon() {
		return "El saludoClon->  " +(new Date()).toString();
	}
	
	@PostMapping("guardar")
	public Persona guardar(@RequestBody Persona persona) {
		Persona aux = new Persona();
		persona.setNombre(persona.getNombre()+" ->El nombre");
		persona.setApellido(persona.getApellido()+" -> El apellido");
		persona.setEdad(persona.getEdad()+18);
		return persona;
	}
}
