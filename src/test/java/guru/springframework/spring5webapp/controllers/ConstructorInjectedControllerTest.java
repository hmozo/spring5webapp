package guru.springframework.spring5webapp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.spring5webapp.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	public void setUp() {
		this.constructorInjectedController= new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}
	

}
