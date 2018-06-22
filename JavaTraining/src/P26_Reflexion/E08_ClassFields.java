package P26_Reflexion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class E08_ClassFields {

	public static void main(String[] args) {
		
		try {
			
			Class<?> objClass = Class.forName("P26_Reflexion.TalkLoud");
			
			TalkLoud talker = (TalkLoud) objClass.newInstance();
			talker.set("Hello");
			talker.print();
			System.out.println(objClass.getName());		
			
			System.out.println();
			
			Field[] fields = objClass.getFields();
			Arrays.asList(fields).forEach(f -> describe(f));
			
			System.out.println("######################################");
			
			fields = Class.forName("java.lang.System").getFields();
			Arrays.asList(fields).forEach(f -> describe(f));
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void describe(Field f) {
		System.out.println("-------------------");
		System.out.println("Name: " + f.getName());
		System.out.println("Modifier: " + Modifier.toString(f.getModifiers()));
		System.out.println("Type: " + f.getType().getName());
		System.out.println("Accessible: " + f.isAccessible());
		System.out.println("-------------------");
	}

}
