package com.alv.dtos;

public class Menu {

	private String texto;
	private Menu submenu;
	
	public Menu() {
		//this.submenu = new Menu();
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Menu getSubmenu() {
		return submenu;
	}
	public void setSubmenu(Menu submenu) {
		this.submenu = submenu;
	}
	
	public String toString() {
		return "->" + this.texto;
	}
	
}
