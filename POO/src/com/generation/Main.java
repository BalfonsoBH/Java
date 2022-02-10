package com.generation;

public class Main {

	public static void main(String[] args) {
		
		Tacos taco1 = new Tacos();
		
		taco1.setTipoDeTortilla("Masa azul");
		taco1.setTipoDeGuisado("Suadero");
		taco1.setNumeroDeTortilla(2);
		taco1.setTamañoDeTortilla("Mediana");
		taco1.setPrecio(30);
		taco1.subirPrecio(5.50f);
		
		System.out.println(taco1.toString());
		
		Tacos taco2 = new Tacos();
		
//		taco2.tipoDeTortilla = "Harina";
//		taco2.tipoDeGuisado = "Bisteck";
//		taco2.numeroDeTortilla = 1;
//		taco2.tamañoDeTortilla = "Grande";
//		taco2.precio = 42.6f;
//		taco2.tipoDeTortilla = "trigo";
		
		taco2.setTipoDeTortilla("Harina");
		taco2.setTipoDeGuisado("Bisteck");
		taco2.setNumeroDeTortilla(1);
		taco2.setTamañoDeTortilla("Grande");
		taco2.setPrecio(42.6f);
		taco2.setTipoDeTortilla("Trigo");
		taco2.subirPrecio(5.50f);
		System.out.println(taco2.toString());
		
//		Tacos taco3 = new Tacos.set("Maiz");
//		System.out.println(taco3);
		
	}

}
