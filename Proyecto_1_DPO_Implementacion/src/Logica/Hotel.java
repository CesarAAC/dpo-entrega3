package Logica;

import java.util.ArrayList;

public class Hotel {
	//Atributos//
	private ArrayList<Habitacion> habitaciones;
	private ArrayList<Huesped> grupos;
	private ArrayList<Servicio> servicios;
	
	//Constructor//
	public Hotel(){
	this.habitaciones=new ArrayList<Habitacion>();
	this.grupos=new ArrayList<Huesped>();
	this.servicios=new ArrayList<Servicio>();
	}

}
