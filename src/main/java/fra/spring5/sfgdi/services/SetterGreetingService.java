package fra.spring5.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String sayGretting() {
		return "Hello World - setter";
	}

}
