package bin.modelo;

public class FacturaAlojamiento {
	private int diasEstancia;
	private int totalPorNoche;
	private int totalAlojamiento;
//Constructor//
	public FacturaAlojamiento(int diasEstancia, int totalPorNoche, int totalAlojamiento) {
		this.diasEstancia=diasEstancia;
		this.totalPorNoche=totalPorNoche;
		this.totalAlojamiento=totalAlojamiento;
	}
	public int getDiasEstancia() {
		return diasEstancia;
	}
	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}
	public int getTotalPorNoche() {
		return totalPorNoche;
	}
	public void setTotalPorNoche(int totalPorNoche) {
		this.totalPorNoche = totalPorNoche;
	}
	public int getTotalAlojamiento() {
		return totalAlojamiento;
	}
	public void setTotalAlojamiento(int totalAlojamiento) {
		this.totalAlojamiento = totalAlojamiento;
	}
	
}
