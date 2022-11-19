package com.alv.dto;

public class Sistema extends Usuario {
	
	private String nick;
	private String pass;
	private String apellido;
	
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	@Override
	public void acumularPuntos(int valorCompra) {			
		if(valorCompra<100000) {			
			this.puntos = this.puntos + 10;			
		}
	}
	
}
