package com.gatitos;

public class Gato {

	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//contructor
	public Gato(String nombre, int patas, boolean adoptado) {
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	
	//getters y setters
	//deben ser publicos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		if(patas >= 0 && patas < 5) {
			this.patas = patas;
		}else {
			throw new IllegalArgumentException("Numero de patas incorrecto");
		}
		//this.patas = patas;
	}
	
	public boolean isAdoptado() {
		return this.adoptado;
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	



	//método tostring
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	 
	 
	
	 
	 
	 
	 
}
