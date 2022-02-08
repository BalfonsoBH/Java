package metodos;

public class Metodos {
	
	//es una funcion
	
	//atributo de la clase
	int a, b;
	
	//Metodo void (vacio)
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El esultado de " + a + " + " + b + " = " + resultado );
	}
	
	//metodo con retorno de valores
	public int sumaConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return a + b;
	}
	
	
	//argumentos
	//suma(argumentos)
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	}
	
	//metodo estatico
	//no requieren un objeto para ser invocado
	
	public static void imprimirNombre(String nombre) {
		System.out.println("Nombre: " + nombre);
	}
	
}
