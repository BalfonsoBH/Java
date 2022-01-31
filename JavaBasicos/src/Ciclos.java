
public class Ciclos {
	
	public static void main(String[] args) {
		
		//while  
		
		// int control = 0;
		
//		while (control < 10) {
//			System.out.println("Control = " + control);
//			control++;
//		}
		
		//do while
		
//		int control = 0;
//		do {
//			System.out.println("Control = " + control);
//			control++;
//		} while(control < 3);
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Control = " + i);
//		}
		
		//break&continue
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue; //permite saltarse una ejecución del ciclo
			}
			System.out.println("Control = " + i);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Control2 = " + i);
			continue;
		}
		
		
	}

}
