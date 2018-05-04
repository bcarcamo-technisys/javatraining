package PXX_Threads;

public class Test extends Thread {

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		print(".", 10);
	}
	
	public void start() {
		super.start();
		run(10);
	}
	
	public void run() {
		print("-", 10);
	}
	
	public void run(int quantity) {
		print("+", quantity);
	}
	
	public static void print(String message, int quantity) {
		for(int i=0; i<quantity; i++) {
			System.out.print(message);
		}
	}

}
