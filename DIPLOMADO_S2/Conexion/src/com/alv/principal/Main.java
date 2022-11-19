package com.alv.principal;

import com.alv.conexion.Conexion;
import com.alv.conexion.ConexionMySQL;
import com.alv.conexion.ConexionSQLExpress;
import com.alv.interfaces.IConexion;
import com.alv.predefinidos.TipoConexion;

public class Main {

	public static void main(String[] args) {
		
		IConexion con = crearConexion(TipoConexion.MySql);
		
		IConexion con2 = crearConexion(TipoConexion.MySql);

		con.conectar("root", "root");
		
		con2.conectar("root", "root");
		
		System.out.println("Termino!!");
	}

	
	
	public static IConexion crearConexion(TipoConexion tipoConexion) {

		if (TipoConexion.MySql.equals(tipoConexion)) {
			return new ConexionMySQL();
		}
		if (TipoConexion.SqlExpress.equals(tipoConexion)) {
			return new ConexionSQLExpress();
		}

		return new Conexion();
	}

}
