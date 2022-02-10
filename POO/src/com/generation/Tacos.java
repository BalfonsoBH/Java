package com.generation;

public class Tacos {

	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamañoDeTortilla;
	private float precio = 0.0f;
	
//	public Tacos() {
//		
//	}
//	
//	public Tacos(String tipoDeTortilla) {
//		this.tipoDeTortilla = tipoDeTortilla;
//	}
	
	//El contructor ayuda a inicializar objetos
//	public Tacos(String tipoDeTortilla, String tipoDeGuisado,
//			int numeroDeTortilla, String tamañoDeTortilla, float precio) {
//		this.tipoDeTortilla = tipoDeTortilla;
//		this.tipoDeGuisado = tipoDeGuisado;
//		this.numeroDeTortilla = numeroDeTortilla;
//		this.tamañoDeTortilla = tamañoDeTortilla;
//		this.precio = precio;
//	}
	
	void preparar() {
		System.out.println("Preparando tu taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}
	
	//getters y setters
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamañoDeTortilla() {
		return tamañoDeTortilla;
	}

	public void setTamañoDeTortilla(String tamañoDeTortilla) {
		this.tamañoDeTortilla = tamañoDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamañoDeTortilla=" + tamañoDeTortilla + ", precio=" + precio + "]";
	}
	
	
}
