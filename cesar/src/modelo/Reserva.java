package modelo;

import java.text.SimpleDateFormat;

public class Reserva {
	//Atributos//
	private Huesped grupo;
	private SimpleDateFormat fechaLlegada;
	private SimpleDateFormat fechaSalida;
	private SimpleDateFormat fechaMaxCancelacion;
	//Constructor//
	public Reserva(Huesped grupo, SimpleDateFormat llegada, SimpleDateFormat salida, SimpleDateFormat max) {
	this.grupo=grupo;
	this.fechaLlegada=llegada;
	this.fechaSalida=salida;
	this.fechaMaxCancelacion=max;
	}
}
