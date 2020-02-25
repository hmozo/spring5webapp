package guru.springframework.spring5webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.spring5webapp.services.GreetingService;
import guru.springframework.spring5webapp.services.GreetingServiceFactory;
import guru.springframework.spring5webapp.services.GreetingServiceFactoryImpl;

@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory() {
		return new GreetingServiceFactoryImpl();
	}
	
	@Bean("greetingService")
	@Profile({"de", "default"})
	GreetingService greetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
	
	@Bean
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}
}
