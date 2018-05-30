package P20_Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E20_ExecutorService {

	public static void main(String[] args) {

		Runnable task = () -> {
			for(int i=0; i<10; i++) {
				String name = Thread.currentThread().getName();
				System.out.println(name + ": " + i);
			}
		};
		
		ExecutorService pool1 = Executors.newCachedThreadPool();
		ExecutorService pool2 = Executors.newCachedThreadPool();
		
		pool1.submit(task);
		pool1.submit(task);
		pool2.submit(task);
		pool2.submit(task);
		
		pool1.shutdown();
		pool2.shutdown();
	}
	
}
