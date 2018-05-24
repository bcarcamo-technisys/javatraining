package P16_Streams;

import java.util.Arrays;
import java.util.List;

public class E03_MapStream {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		nums.stream().filter(d -> d < 5)
					 .map(d -> d * d)
		             .forEach(System.out::println);
		
	}

}
