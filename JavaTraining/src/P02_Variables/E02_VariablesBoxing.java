package P02_Variables;

public class E02_VariablesBoxing {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int native_int = 5;
		Integer wrapper_int = new Integer(5);
		int outboxing_int = new Integer(5);
		Integer autoboxing_int = 5;
		
		double native_double = 5.0;
		Double wrapper_double = new Double(5.0);
		double unboxing_double = new Double(5.0);
		Double boxing_double = 5.0;

	}

}
