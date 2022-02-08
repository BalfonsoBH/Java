import java.util.Scanner;

public class DeletreaNombre {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Tu nombre deletreado es: ");
		System.out.println("-------------------------------");
		for (int i = 0; i <= (nombre.length() - 1); i++ ) {
			System.out.println(nombre.charAt(i));
		}
		System.out.println("-------------------------------");
		
	}
}
