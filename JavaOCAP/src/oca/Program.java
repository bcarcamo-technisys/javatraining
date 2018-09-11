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
		
		byte l = (byte) p1.nombre.length();
		
		p1.nombre.equals(p2.nombre);
		
		// p1.nombre == p2.nombre;
		
		p1.nombre.equalsIgnoreCase(p2.nombre);
		
		p1.nombre.substring(1, 3);
		
		int c = p1.nombre.charAt(2);
		
		System.out.println(c);
		
	}

}

class Persona {
	
	String nombre;
	
}



