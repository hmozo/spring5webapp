package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.spring5webapp.services.GreetingService;

@Service
@Primary
@Profile("en")
public class GetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}

}
