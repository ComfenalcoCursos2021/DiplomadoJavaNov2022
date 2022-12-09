package com.alv.main;

import com.alv.dtos.Menu;

public class Main {

	public static void main(String[] args) {
		
		Menu navigate = new Menu();
		Menu openSetUp = new Menu();
		Menu parentModel = new Menu();
		Menu eclipseOrg = new Menu();
		Menu eclipseOrgSubmenu = new Menu();
		
		navigate.setTexto("Navigate");
		openSetUp.setTexto("OpenSetup");
		parentModel.setTexto("Parent Model");
		eclipseOrg.setTexto("Eclipse Org");
		eclipseOrgSubmenu.setTexto("El submenu de eclipse ORG");
		
		
		navigate.setSubmenu(openSetUp);
		openSetUp.setSubmenu(parentModel);
		parentModel.setSubmenu(eclipseOrg);
		eclipseOrg.setSubmenu(eclipseOrgSubmenu);
		
		System.out.println("=======================");
		Menu auxiliar = navigate;
		while(auxiliar != null) {
			System.out.println(auxiliar);
			auxiliar = auxiliar.getSubmenu();
		}
		System.out.println("------------------------");
		/*
		System.out.println(navigate.getTexto());		
		
		System.out.println(navigate.getSubmenu());		
		//navigate.getSubmenu().setSubmenu(parentModel);		
		System.out.println(navigate.getSubmenu().getSubmenu());		
		//navigate.getSubmenu().getSubmenu().setSubmenu(eclipseOrg);				
		System.out.println(navigate.getSubmenu().getSubmenu().getSubmenu());*/
		
		
		System.out.println("Termino!!! ");

	}

}
