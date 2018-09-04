package oca;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		Persona p1 = new Persona();
		
		p1.nombre = "Ju";
		
		p1.nombre = p1.nombre + "an";
		
		Persona p2 = new Persona();
		
		p2.nombre = "Juan";
		
		System.out.println(p1.nombre.equals(p2.nombre));
		
	}

}

class Persona {
	
	String nombre;
	
}



