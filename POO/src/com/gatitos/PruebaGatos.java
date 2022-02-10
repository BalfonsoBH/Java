package com.gatitos;

public class PruebaGatos {

	public static void main(String[] args) {
		
		Gato g = new Gato("Taco", 3, true);
		//g.nombre = "Taco";
		//g.patas = 3;
		
		g.setNombre("Misifus");
		g.setPatas(4);
		g.setAdoptado(false);
		
		System.out.println(g);
		
		
		//excepciones
//		int num1 = 5, num2 = 0;
//		int resultado = num1/num2;
//		System.out.println(resultado);
	}

}
