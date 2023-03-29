package Logica;

import java.util.ArrayList;

public class Habitacion {
	//Atributos//
	private String identificador;
	private String tipoHabitacion;
	private ArrayList<Cama> camas;
	private String ubicacion;
	private int capacidadAdultos;
	private int capacidadInfantes;
	private int tarifa;
	private String fechaInicialTarifa;
	private String fechaFinalTarifa;
	private String diasTarifa;
	private boolean balcon;
	private boolean vistas;
	private boolean cocina;
	private boolean ocupada;
	
	//Constructor
	public Habitacion(String identificador, String ubicacion,String tipo, int tarifa, String fechainicial, String fechaFinal, String Dias, boolean balcon,boolean vistas, boolean cocina) {
	this.identificador=identificador;
	this.tipoHabitacion=tipo;
	this.camas= new ArrayList<Cama>();
	this.capacidadAdultos=0;
	this.capacidadInfantes=0;
	this.ubicacion=ubicacion;
	this.fechaInicialTarifa=fechainicial;
	this.fechaFinalTarifa=fechaFinal;
	this.tarifa=tarifa;
	this.diasTarifa=Dias;
	this.balcon=balcon;
	this.vistas=vistas;
	this.cocina=cocina;
	this.ocupada=false;
	
	}

}
