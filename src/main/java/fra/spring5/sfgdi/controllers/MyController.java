package fra.spring5.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import fra.spring5.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayGretting();
	}
}
