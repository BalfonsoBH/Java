import java.util.Scanner;

public class EjercicioDescuento {

	// solicitar el total de una compra por consola.
			// si la cuenta es de menos de 1000
			// sila cuenta es de 1001 - 4999 10%
			// si la cuenta es de 5001 a 9999 20%
			// si la copra es de 10000 o más 30%
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu monto de compra");
		int compra = sc.nextInt();
		
		if (compra <= 1000) {
			System.out.println("Su monto no califica a descuento");
		} else if (compra >= 1001 && compra <= 4999) {
			double compraDes = compra * 0.10;
			System.out.println("Tu total con descuento del 10% es: " + (compra - compraDes));
			System.out.println("Valor original de compra: " + compra);
			System.out.println("Monto de descuento: " + compraDes);
		} else if (compra >= 5000 && compra <= 9999) {
			double compraDes = compra * 0.20;
			System.out.println("Tu total con descuento del 20% es: " +(compra - compraDes));
			System.out.println("Valor original de compra: " + compra);
			System.out.println("Monto de descuento: " + compraDes);
		} else if (compra >= 10000) {
			double compraDes = compra * 0.30;
			System.out.println("Tu total con descuento del 30% es: " + (compra - compraDes));
			System.out.println("Valor original de compra: " + compra);
			System.out.println("Monto de descuento: " + compraDes);
		}
		
	}
	
}
