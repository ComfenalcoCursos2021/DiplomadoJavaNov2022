package com.alv.dto;

public abstract class Usuario {
	
	private String cedula;
	private String nombre;
	private String correo;
	protected int puntos;
	
	
	public Usuario() {
		System.out.println("CONSTRUCTOR SIN PARAMETROS");
	}
	
	public Usuario(String nombre) {
		System.out.println("CONSTRUCTOR con el nombre");
		this.nombre = nombre;
	}
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}	
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void acumularPuntos(int valorCompra) {
		this.puntos = this.puntos + (valorCompra / 100);
	}
	
	
	
}
