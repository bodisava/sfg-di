package fra.spring5.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fra.spring5.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
