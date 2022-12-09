package com.alv.beans;

import java.io.Serializable;

public class HelloBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mensaje;
	public HelloBean() {
		this.mensaje = "Este mensaje desde el manager";
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
