package com.alv.main;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.alv.dtos.PersonaQueViene;
import com.alv.utils.RestUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String respuestaSaludo = RestUtil
				.urlConnectionGetRequest("http://localhost:8080/HotelService-0.0.1-SNAPSHOT/test/saludo");
		System.out.println("---> " + respuestaSaludo);

		try {
			String respuesta = RestUtil.urlConnectionGetRequest("http://localhost:8080/persona/obtenerPrimero");
			ConvertirUno(respuesta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			String respuesta = RestUtil.urlConnectionGetRequest("http://localhost:8080/persona/listar");
			ConvertirTodos(respuesta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Termino");
	}

	public static void ConvertirUno(String contenido) {
		Gson gson = new Gson();
		PersonaQueViene persona = gson.fromJson(contenido, PersonaQueViene.class);
		System.out.println(persona);

	}

	public static void ConvertirTodos(String contenido) {
		Gson gson = new Gson();

		List<PersonaQueViene> personas = (ArrayList<PersonaQueViene>) fromJson(contenido,
				new TypeToken<ArrayList<PersonaQueViene>>() {
				}.getType());

		for (PersonaQueViene persona : personas) {

			System.out.println(persona);
			System.out.println("---------------------------");

		}

	}

	public static Object fromJson(String jsonString, Type type) {
		return new Gson().fromJson(jsonString, type);
	}

}
