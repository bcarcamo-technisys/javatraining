package cl.netec.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.netec.spring.beans.Mundo;
import cl.netec.spring.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
		Mundo m = (Mundo) appContext1.getBean("mundo");
		System.out.println(m.getSaludo());
		((ConfigurableApplicationContext) appContext1).close();
		
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("cl/netec/spring/xml/beans.xml");
		Persona p = (Persona) appContext2.getBean("persona");
		System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getApodo());
		((ConfigurableApplicationContext) appContext2).close();
		
	}

}
