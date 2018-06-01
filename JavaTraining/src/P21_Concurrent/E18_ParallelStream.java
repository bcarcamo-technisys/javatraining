package P21_Concurrent;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class E18_ParallelStream {

	public static void main(String[] args) {
		
		List<Integer> values = getValues();
		
		LocalDateTime ini = LocalDateTime.now();
		
		long result = values.stream().filter(d -> d % 2 == 0).collect(Collectors.counting());
		
		LocalDateTime fin = LocalDateTime.now();
		
		System.out.printf("Time Required: %,d msg\n", Duration.between(ini, fin).toMillis());
		System.out.printf("Result: %,d\n", result);
		
		System.out.println();
		
		ini = LocalDateTime.now();
		
		result = values.parallelStream().filter(d -> d % 2 == 0).collect(Collectors.counting());
		
		fin = LocalDateTime.now();
		
		System.out.printf("Time Required: %,d msg\n", Duration.between(ini, fin).toMillis());
		System.out.printf("Result: %,d\n", result);

		System.out.println();
		
		ini = LocalDateTime.now();
		
		result = values.stream().parallel().filter(d -> d % 2 == 0).collect(Collectors.counting());
		
		fin = LocalDateTime.now();
		
		System.out.printf("Time Required: %,d msg\n", Duration.between(ini, fin).toMillis());
		System.out.printf("Result: %,d\n", result);
		
		System.out.println();
		
		ini = LocalDateTime.now();
		
		result = values.stream().filter(d -> d % 2 == 0).parallel().collect(Collectors.counting());
		
		fin = LocalDateTime.now();
		
		System.out.printf("Time Required: %,d msg\n", Duration.between(ini, fin).toMillis());
		System.out.printf("Result: %,d\n", result);
		
		System.out.println();
		
		ini = LocalDateTime.now();
		
		result = values.stream().parallel().filter(d -> d % 2 == 0).sequential().collect(Collectors.counting());
		
		fin = LocalDateTime.now();
		
		System.out.printf("Time Required: %,d msg\n", Duration.between(ini, fin).toMillis());
		System.out.printf("Result: %,d\n", result);
		
		System.out.println();
		
		result = values.stream().parallel().filter(d -> d % 2 == 0).findAny().get();
		
		System.out.printf("Result: %,d\n", result);
		
		result = values.stream().parallel().filter(d -> d % 2 == 0).findAny().get();
		
		System.out.printf("Result: %,d\n", result);
		
		result = values.stream().parallel().filter(d -> d % 2 == 0).findAny().get();
		
		System.out.printf("Result: %,d\n", result);
		
	}
	
	private static List<Integer> getValues(){
		List<Integer> values = new ArrayList<>();
		
		for(int i=0; i<100_000_000; i++) {
			values.add(ThreadLocalRandom.current().nextInt(0, 100));
		}
		
		return values;
	}

}
