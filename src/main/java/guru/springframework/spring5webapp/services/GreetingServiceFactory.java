package guru.springframework.spring5webapp.services;

public interface GreetingServiceFactory {
	
	GreetingService createGreetingService(String lang);
	
	
}
