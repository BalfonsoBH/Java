import java.util.Scanner;

public class NumeroParInpar {
	
	public static void main(String[] args) {
	/*
	 * Crear un nuevo proyecto llamado NumeroParImpar
		crear el m�todo main
		crear una funci�n que eval�e si un n�mero es par o impar (se puede usar el operador ternario)
		Imprimir en terminal el resultado

	 	*extra, investigar c�mo usar la clase Scanner en java.
	
	 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu numero: ");
		int numero1 = sc.nextInt();
		
		String resultado = (numero1 % 2 == 0)? ("es par") : ("es impar");
		System.out.println(resultado);
	}
}
