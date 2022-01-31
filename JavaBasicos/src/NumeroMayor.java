import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		
		System.out.println("Escriber tu primer numero");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		
		System.out.println("Escriber tu segundo numero");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		System.out.println("Escriber tu tercer numero");
		Scanner sc3 = new Scanner(System.in);
		int n3 = sc3.nextInt();
		
		if (n1 == n2 && n3 == n1) {
			System.out.println("Los tres numeros son iguales");
		} else if (n1 == n2 || n3 == n1 || n2 == n3) {
			if (n1 == n2) {
				if (n1 > n3) {
					System.out.println("El primer y segundo numero: "+ n1 + " son iguales y mayores que el tercero: " + n3);
				} else {
					System.out.println("El primer y segundo numero: "+ n1 + " son iguales y menores que el tercero: " + n3);
				}
			} else if (n1 == n3) {
				if (n1 > n2) {
					System.out.println("El primer y tercer numero: "+ n1 + " son iguales y mayores que el segundo: " + n2);
				} else {
					System.out.println("El primer y tercer numero: "+ n1 + " son iguales y menores que el segundo: " + n2);
				}
			} else if (n2 == n3) {
				if (n2 > n1) {
					System.out.println("El segundo y tercer numero: "+ n2 + " son iguales y mayores que el primero: " + n1);
				} else {
					System.out.println("El segundo y tercer numero: "+ n1 + " son iguales y menores que el primero: " + n1);
				}
			}
		}else if (n1 > n2 || n3 > n2) {
			if (n1 > n3) {
				System.out.println("El numero mayor es: " + n1);
			} else {
				System.out.println("El numero mayor es: " + n3);
			}
		} else {
			System.out.println("El numero mayor es: " + n2);
		}
		
		
	}
}
