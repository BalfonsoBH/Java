package metodos;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		
		Metodos.imprimirNombre("BABH");
		
		//crear un objeto que va a contener los metodos y atributos
		Metodos MetodoPrueba = new Metodos();
		
		MetodoPrueba.a = 10;
		MetodoPrueba.b = 26;
		
		MetodoPrueba.sumar(); //invocamos el metodo
		
		int resultado = MetodoPrueba.sumaConRetorno();
		System.out.println(MetodoPrueba.sumaConRetorno()); //metodo con retorno
		
		//metodo con argumentos
		
		double multiplica = MetodoPrueba.multiplicarConArgumentos(40, 20.5);
		System.out.println("El valor de la multiplicacion con argumentos es " + multiplica);
		
		
	}

}
