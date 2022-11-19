package com.alv.conexion;

import com.alv.interfaces.IConexion;

public class ConexionSQLExpress implements IConexion{

	@Override
	public void conectar(String user, String pass) {
		System.out.println("CONECTAR SQL EXPRESS");
		
	}

	@Override
	public void desConectar() {
		System.out.println("DESCONECTAR SQL EXPRESS");
		
	}

}
