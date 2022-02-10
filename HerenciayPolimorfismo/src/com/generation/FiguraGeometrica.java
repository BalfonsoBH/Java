package com.generation;

public abstract class FiguraGeometrica {
	//clases abstractas
	//pueden o no contener metodos abstractos
	// no podemos crear objetos de ellas
	//si pueden heredar a otras
	
	private String nombre;
	private float alto;
	private float largo;
	
//	public FiguraGeometrica() {
//		
//	}
	//constructor
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodo abstracto
	//te dice que hacer pero no como
	public abstract float calcularArea();
	
	public abstract float perimetro();

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
		
}
