import java.util.Scanner;

public class Tabla {
	
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar de  " + num);
	        
	       //Implementa un bucle while que imprima el resultado
	        
	        int control = 0;
	        int multiplica = 0;
	        
	        while (control <= 10) {
	        	multiplica = num * control;
	        	System.out.println(num + " * " + control + " = " + multiplica);
	        	control++;
	        }
	    }
}
