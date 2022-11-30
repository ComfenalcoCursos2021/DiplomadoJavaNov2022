package com.echo.service.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echo.service.dtos.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer>{

}
