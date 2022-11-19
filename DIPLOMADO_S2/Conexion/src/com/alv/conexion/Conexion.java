package com.alv.conexion;

import com.alv.interfaces.IConexion;

public class Conexion implements IConexion {

	public void conectar(String user, String pass) {
		System.out.println("SE CONECTO!");
	}
	
	public void desConectar() {
		System.out.println("SE DESCONECTO!");
	}
}
