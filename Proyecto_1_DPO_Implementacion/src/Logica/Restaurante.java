package Logica;

import java.util.ArrayList;

public class Restaurante {
	//Atributos//
	private String ubicacion;
	private String dias;
	private String horario;
	private ArrayList<Bebida> bebidas;
	private ArrayList<Plato> platos;
	//Constructor//
	public Restaurante(String ubicacion, String dias, String horario) {
	this.ubicacion=ubicacion;
	this.dias=dias;
	this.horario=horario;
	this.bebidas= new ArrayList<Bebida>();
	this.platos= new ArrayList<Plato>();
	}

}
