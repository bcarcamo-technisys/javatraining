package P26_Reflexion;

public class E03_ClassMultiInstance {

	public static void main(String[] args) {
		
		Class<?> printerClass;
		Printable printer1, printer2;
		try {
			
			printerClass = Class.forName("P26_Reflexion.Hello");
			printer1 = (Printable) printerClass.newInstance();
			printer2 = (Printable) printerClass.newInstance();
			System.out.println(printerClass.getName());
			
			System.out.println();
			
			printer1.print();
			printer2.print();
			
			System.out.println(printer1 == printer2);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
}
