package guru.springframework.spring5webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import guru.springframework.spring5webapp.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	//@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService= greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
