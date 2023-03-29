package Logica;

import java.util.ArrayList;

public class Factura {
	//Atributos//
	private ArrayList<Servicio> servicios;
	private int total;
	// private formaPago;
	
	//Constructor//
	public Factura() {
	this.servicios= new ArrayList<Servicio>();
	this.total=0;
	}

}
