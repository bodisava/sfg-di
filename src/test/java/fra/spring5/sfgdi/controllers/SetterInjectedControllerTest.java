package fra.spring5.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fra.spring5.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUpBeforeClass() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
