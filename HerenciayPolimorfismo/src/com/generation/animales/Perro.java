package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar {

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con una pelota");
		
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un auto");
		
	}

	@Override
	public void baniar() {
		System.out.println("Me gusta el agua");
		
	}

	@Override
	public void moverColita() {
		System.out.println("Estoy feliz");
		
	}

	@Override
	public void perseguir() {
		System.out.println("Voy");
		
	}

	
}
