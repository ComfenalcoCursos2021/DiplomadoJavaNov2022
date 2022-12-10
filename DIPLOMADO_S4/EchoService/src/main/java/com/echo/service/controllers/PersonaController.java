package com.echo.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.echo.service.daos.PersonaDao;
import com.echo.service.dtos.Persona;

@RestController
@RequestMapping("persona")
public class PersonaController {

	@Autowired
	private PersonaDao personaDao;
	
	@GetMapping("listar")
	public List<Persona> listar(){
		return personaDao.findAll();
	}
	
	@GetMapping("obtenerPrimero")
	public Persona primero() {
		return personaDao.findAll().get(0);
	}
	
	@PostMapping("guardar")
	public Persona guardar(@RequestBody Persona persona) {
		Persona aux = new Persona();
		persona.setNombre(persona.getNombre()+" ->El nombre");
		persona.setApellido(persona.getApellido()+" -> El apellido");
		persona.setEdad(persona.getEdad()+18);
		personaDao.save(persona);
		return persona;
	}
}
