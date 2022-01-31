import java.util.Scanner;

public class EstructuraDeControlIf {

	//estructura de control de flujo
	//toma de desiciones
	//sirven para cambiar el flujo del programa evaluando condiciones
	
	public static void main(String[] args) {
		
		/*if(condicion) {
			codigo
		}else {
			codigo
		}*/
		
		System.out.println("introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		/*  Pedir tres numeros al usuario y evaluar el mayor*/
		
	}
}
