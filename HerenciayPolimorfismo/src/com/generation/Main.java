package com.generation;

public class Main {

	public static void main(String[] args) {
		//Herencia: cuando una clase hereda a otra y puede acceder a sus atributos
		// y metodos
		Cuadrado cuadrado1 = new Cuadrado();
		//cuadrado1.setNombre("cuadrado");
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		System.out.println("El area del " + cuadrado1.getNombre() + " es "
							+ cuadrado1.calcularArea());
		
		System.out.println(cuadrado1.getNombre());
		
		Triangulo triangulo1 = new Triangulo();
		//triangulo1.setNombre("triangulo");
		triangulo1.setAlto(10);
		triangulo1.setLargo(15);
		System.out.println("El area del " + triangulo1.getNombre() + " es "
				+ triangulo1.calcularArea());
		System.out.println(triangulo1.getNombre());
		
		
	}

}
