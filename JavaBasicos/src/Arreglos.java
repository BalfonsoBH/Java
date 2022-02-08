
public class Arreglos {

	public static void main(String[] args) {
		
		int numeros []; //creamos variable con arreglos
		numeros = new int[4]; //crea el arreglo
				
		String[] nombres = new String[4];
		
		//arrayliteral
		String []nombresFrutas = new String[] {"manzana", "platano", "uva", "pera"};
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		//numeros[4] = 300;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		System.out.println(numeros[0]);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			System.out.println(nombres[i]);
			System.out.println(nombresFrutas[i]);
			System.out.println("-------------------");
		}
	}

}
