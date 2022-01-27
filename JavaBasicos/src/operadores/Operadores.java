package operadores;

public class Operadores {
	
	public static void main(String[] args) {
		
		//operadores aritmeticos
		//+, -, /, *, %
		int a = 10;
		int b = 20;
		double c = 10.5;
		
		int suma = a + b;
		System.out.println(suma);
		
		String strl = "El resultado de la suma es: ";
		System.out.println(strl + suma);
		
		//resta
		System.out.println("El resultado de la resta es: " + (a - b));
		
		//division
		int division = a / b;
		System.out.println("El resultado de la division es: " + division);
		
		double division2 = c / b;
		//por lo menos uno de los datos debe ser double
		//10.0 / 20 = 0.5
		System.out.println("El resultado de la division es: " + division2);
		
		//multiplicacion
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		//modulo
		double modulo = a % b;
		System.out.println("El modulo de la operaacion es: " + modulo);
		
		
		//operador de asignacion
		// + =
		
	int d, e; //variables int vacias
	e= 6;
	d = 5;
	System.out.println(d + " - " + e);
	
	//operadores de declaracion compuesta
	//+=, -=, *=, /=, %=
	//una operacion simplificada
	
	int f = 0, g = 5;
	f += 5;
	//f = f + 5
	System.out.println(f);
	
	//operadores relacionales
	//<, >, <=, >=, ==, !=, resultado de un booleano (true y false)
	
	int h = 15, i = 25;
	String j = "hola";
	System.out.println(h > i); //false
	System.out.println(i != h);
	//System.out.println(h != j); no da porque son valores distintos
	
	//operador unario
	//'preasignacion y postasignacion (++ y --)
	//++k asigna un valor antes de usarse
	//k++ primero lee el valor y despues le suma 1
	
	int k = 0, l = 0;
	System.out.println(++k);
	System.out.println(--l);
	
	//Precedencia de operadores 
	
	int operacion = (4 + 5) * 6 / 3;
	System.out.println(operacion);
	
	int x = 0, y = 0;
	int operacion2 = ++x + y--;
	System.out.println(operacion2);
	
	//operador ternario
	
	int edad = 19, valor1 = 0;
	int resultado = (edad <= 18)? (valor1 = 2) : (valor1 = 3);
	//String resultado (edad <= 18)? "uno" : "dos";
	//parentesis del if, opcionales
	System.out.println(resultado);
	
	//operador logico
	//and - &&, or - ||, not - !
	
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(true || false);
	System.out.println(true && !false);
	
	}
}
