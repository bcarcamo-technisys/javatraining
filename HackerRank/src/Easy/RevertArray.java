package Easy;

import java.util.Scanner;

public class RevertArray {

	static int[] reverseArray(int[] a) {
		
	}
	
	private static final Scanner scanner = new Scanner(System.in);  
	
	public static void main(String[] args) {
		
		int arrCount = Integer.parseInt(scanner.nextLine().trim());

		
		
		
		
		try(Scanner console = new Scanner(System.in)) {
			
			int size = Integer.parseInt(console.nextLine());
			
			String text = console.nextLine();
			
			String[] list = text.split("[ ]");
			
			for(int i=0; i<size; i++) {
				System.out.print(list[size-i-1] + " ");
			}
			
		}
		
	}

}
