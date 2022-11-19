package com.alv.conexion;

import com.alv.interfaces.IConexion;

public class ConexionMySQL implements IConexion {

	
	/*
	 * @param
	 * 
	 * 
	 * */
	@Override
	public void conectar(String user, String pass) {
		System.out.println("CONECTAR MYSQL");
		
	}

	@Override
	public void desConectar() {
		System.out.println("DESCONECTAR MYSQL");
		
	}

}
