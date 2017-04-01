package ar.utn.dds;

public class Persona {
	
	private String nombre;
	private int cantidadCelulas;
	private int temperatura;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadCelulas() {
		return cantidadCelulas;
	}
	public void setCantidadCelulas(int cantidadCelulas) {
		this.cantidadCelulas = cantidadCelulas;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public boolean estaEnComa(){
		
		return this.temperatura>45;
	}
}
