package P16_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E10_CollectorsStream {

	public static void main(String[] args) {
		
		List<Person> people = getPeople(); 
				
		List<Person> filterPeople = people.stream().filter(p -> p.age < 30).collect(Collectors.toList());
		filterPeople.forEach(System.out::println);
		
		System.out.println();
		
		people.stream().collect(Collectors.groupingBy(p -> ((Person) p).place)).forEach((k,v) -> System.out.println(k + " : " + v));
		
		System.out.println();
		
		System.out.println(people.stream().map(p -> p.name).collect(Collectors.joining(" - ")));
		
		System.out.println();
		
		System.out.println(people.stream().collect(Collectors.averagingInt(p -> p.age)).toString());
		
		System.out.println();
		
		System.out.println(people.stream().collect(Collectors.groupingBy(p -> ((Person)p).place)).keySet().stream().collect(Collectors.counting()).toString());
	}
	
	private static List<Person> getPeople() {
		return Arrays.asList(new Person("Juan", 30, "Chile"),
                             new Person("Carlos", 40, "Argentina"),
                             new Person("Maria", 20, "Chile"),
                             new Person("Andres", 20, "Argentina"));
	}
	
	private static class Person implements Comparable<Person> {
		
		public String name;
		public Integer age;
		public String place;
		
		public Person(String name, Integer age, String place) {
			this.name = name; this.age = age; this.place = place;
		}

		@Override
		public int compareTo(Person other) {
			return this.name.compareTo(other.name);
		}
		
		@Override
		public String toString() {
			return this.name + " (" + this.age + ") - " + this.place;
		}
		
	}

}
