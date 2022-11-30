package com.alv.dto;

import java.util.List;

public class ReporteSource {

	private String titulo;
	private List<Country> paises;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Country> getPaises() {
		return paises;
	}
	public void setPaises(List<Country> paises) {
		this.paises = paises;
	}
	
	
}
