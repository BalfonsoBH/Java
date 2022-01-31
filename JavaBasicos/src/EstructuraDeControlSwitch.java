import java.util.Scanner;

public class EstructuraDeControlSwitch {

	
	//sirve para controlar el flujo de comportamiento del programa
	/*
	 switch(condicion) {
	 	case "valor":
	 		codigo a ejecutar
	 		break;
	 	case "n":
	 		codigo a ejecutar}
	 		break;
	 	default
	 		codigo a ejecutar
	 ]
	 * 
	 */
	//Solicitra al usuario un dia y mostrar un mensaje
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un dia de la semana y recibe un mensaje");
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Ya casi es viernes");
			break;
			case "martes":
				System.out.println("Ya casi es más viernes");
			break;
			case "miercoles":
				System.out.println("Miercoles, pero a qué costo");
			break;
			case "jueves":
				System.out.println("Juebebes");
			break;
			case "viernes":
				System.out.println("Viernes de actitud");
			break;
			case "sabado":
				System.out.println("Sabado de pozole");
			break;
			case "domingo":
				System.out.println("Domingo de resurrección");
			break;
			default:
				System.out.println("Dia descomnocido");
			
			}
	}
	
}
