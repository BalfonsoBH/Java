import java.util.Scanner;

public class Ejerciciotriangulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] angulos = new int[3]; 
		
		for (int i = 0; i <= 2; i++ ) {
			System.out.println("Escriber tu angulo numero " + (i + 1));
			angulos[i] = sc.nextInt();
		}
		
		if ((angulos[0] + angulos[1] + angulos[2]) == 180) {
			System.out.println("Triangulo valido");
		} else {
			System.out.println("Triangulo invalido");
		}
		
	}
}
