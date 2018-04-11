package netec.oca.getstarted;

import java.util.Scanner;

public class SchoolAccess {

	public static void main(String[] args) {
		
		CompleteTest.test();
		
	}

}

class SimpleTest {
	
	public static void test() {
		
		try(Scanner console = new Scanner(System.in)){
			
			System.out.print("Level: ");
			int level = console.nextInt();
			System.out.print("Age: ");
			int age = console.nextInt();
			
			System.out.println();
			String access = (age >= level + 5) ? "Permited" : "Denied";
			String msg = "The access to the school in this level is " + access;
			System.out.println(msg);
			
		}

	}
	
}

class CompleteTest {
	
	public static void test() {
		
		try(Scanner console = new Scanner(System.in)){
			
			System.out.print("Age: ");
			int age = console.nextInt();
			
			System.out.println();
			Levels maxLevel = Levels.values()[age - 4];
			String msg = "The maximum level that could be accessed is " + maxLevel;
			System.out.println(msg);
			
		}

	}
	
}

enum Levels { PREKINDER, KINDER, 
	          PRIMERO_BASICO, SEGUNDO_BASICO, TERCERO_BASICO, 
	          CUARTO_BASICO, QUINTO_BASICO, SEXTO_BASICO, 
	          SEPTIMO_BASICO, OCTAVO_BASICO, PRIMERO_MEDIO, 
	          SEGUNDO_MEDIO, TERCERO_MEDIO, CUARTO_MEDIO }  