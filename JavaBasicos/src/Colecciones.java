import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Colecciones {

	public static void main(String[] args) {
		
		//Sirven para almacenar un conjunto de objetos
		//las colecciones son dinamicas
		
		//set tiene tres tipos de implementaciones
		//sin elemtos repetidos
		
		//HashSet
		//los elemntos no mantienen un orden
		//es la implementacion más rapida
		
		/*Set <String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		//foreach puede recorrer una collección y en cada recorrido
		//recuperael valor y lo podemos almacenar en una variable
		//Sintaxis
		//for(TipodeElemento VAriable : elementoARecorrer)
		
		/*for (String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		//TreeSet
		//ordena elementos en funcion de sus padres
		
//		Set <String> frutas = new TreeSet<String>();
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandia");
//		frutas.add("mamey");
//		frutas.add("fresa");
//		
//		for (String fruta : frutas) {
//			System.out.println(fruta);
//		}
		
		//LinkedHashSet
		//orden de uncersion de los elemntos
		//mas costoso que HashSet
		
//		Set <String> frutas = new LinkedHashSet<String>();
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandia");
//		frutas.add("mamey");
//		frutas.add("fresa");
//		
//		for (String fruta : frutas) {
//			System.out.println(fruta);
		
		//listas
		//Se permiten elemntos duplicados
		//Se manejan posiciones, se puee acceder  los eleemntos
		//Buscar elementos
		
		//ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("evve");
		pokemones.add("Arcanine");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("metapod");
		pokemones.add("metapod");
		
		pokemones.add(2, "Pikachu");
		
		pokemones.remove(3);
		
		//set remplaza el elemnto de la poscion
		pokemones.set(0, "magikarp");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("*******************");
		System.out.println(pokemones.get(0));
		
		System.out.println(pokemones.indexOf("metapod"));
		System.out.println(pokemones.lastIndexOf("metapod"));
		//si hay dos iguales, devuelve el primero
		
		
		//LinkedList
		//doblemente enlazada
		
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		//Map
		//Asocia claves a valores
		//No claves uplicadas
		
		//HashMap
		//Mejor rendimiento pero no garantiza un orden
		//a la hora de hacer iteraciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1123, "Carlos Eduardo");
		usuarios.put(2456, "Raul");
		usuarios.put(3466, "Ro");
		
		System.out.println(usuarios.get(1123));
		
		//keySet
		//recupera el nombre de la clave
		
		System.out.println(usuarios.keySet());
		
		//values
		//recupera el valor directamente
		
		System.out.println(usuarios.values());
		
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole rojo");
		tamales.put("Torta", "Mole verde");
		tamales.put("Dulce", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		tamales.entrySet().forEach(elemento -> {
			//System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			System.out.println(elemento.getKey());
		});
		
		
		//LinkedHashMap
		//guarda los elementos en el orden en el que se integran
		
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(567, "Tsuru");
		carros.put(345, "Mustang");
		
		System.out.println("*************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
		
		 
		
	}
	
}
