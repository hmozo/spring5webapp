package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.GreetingServiceImpl;

public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return getGreetingService().sayGreeting();
	}
	
	public GreetingServiceImpl getGreetingService() {
		return greetingService;
	}

}
