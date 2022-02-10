package paquete2;

public class ClasePrivada {

	//atributos
	private String nombre;
	private int edad; 
	
	//metodos
	public void setSaludar(String nombre) { //fija un valor
		
		this.nombre = nombre;
	}
	
	public String getSaludar() {
		return this.nombre;
	}
	
}
