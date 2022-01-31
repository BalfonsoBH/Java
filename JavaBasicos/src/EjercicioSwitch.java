import java.util.Scanner;

public class EjercicioSwitch {

	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
	   * 
	   * y despues imprimir el resultado
	   */

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu numero 1");
		int numero1 = sc.nextInt();
		System.out.println("Escribe tu numero 2");
		int numero2 = sc.nextInt();
		System.out.println("Escribe 1 para sumar, 2 para restar, tres para dividir o 4 para multiplicar");
		int numero3 = sc.nextInt();
		int operacion = 0;
		
		switch(numero3) {
			case 1:
				operacion = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + operacion);
			break;
			case 2:
				operacion = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + operacion);
			break;
			case 3:
				double operacionr = (double) numero1 / numero2;
				System.out.println("El resultado de la division es: " + operacionr);
			break;
			case 4:
				operacion = numero1 * numero2;
				System.out.println("El resultado de la multiplicacion es: " + operacion);
			break;
			default:
				System.out.println("Opcion invalida");
		}
	}
}
