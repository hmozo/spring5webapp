package guru.springframework.spring5webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("greetingService")
@Profile({"de", "default"})
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS= "Aufidersen (greetingServiceImpl)!!!";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}
