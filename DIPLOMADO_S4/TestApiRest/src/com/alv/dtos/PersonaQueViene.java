package com.alv.dtos;

public class PersonaQueViene {
	private String apellido;
	private String nombre;
	private int edad;
	private int id;
	public String toString() {
		return "Nombre\t" + this.nombre + "\r\nApellido\t"+apellido+ "\r\nEdad\t"+edad;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
