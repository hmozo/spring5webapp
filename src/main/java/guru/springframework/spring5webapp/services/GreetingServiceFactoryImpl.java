package guru.springframework.spring5webapp.services;


public class GreetingServiceFactoryImpl implements GreetingServiceFactory {

	
	@Override
	public GreetingService createGreetingService(String lang) {
		switch(lang) {
		case "de":
			return new GreetingServiceImpl();
		case "es":
			return new PrimarySpanishGreetingService();
		default:
			return new PrimarySpanishGreetingService();
		}
	}

}
