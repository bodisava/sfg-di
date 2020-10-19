package fra.spring5.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

	@Override
	public String sayGretting() {
		return "Hello World - property";
	}

}
