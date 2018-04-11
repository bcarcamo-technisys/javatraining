package cl.netec.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cl.netec.spring.beans.Mundo;


@Configuration
public class AppConfig {

	@Bean
	public Mundo mundo() {
		return new Mundo();
	}
	
}
