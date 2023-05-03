package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		RestTemplate template = new RestTemplate();
		String serviceUrl = "http://localhost:4444//api/actor/wish";

		ResponseEntity<String> responseEntity = template.getForEntity(serviceUrl, String.class);

		System.out.println("ResponseBody              :: " + responseEntity.getBody());
		System.out.println("ResponseStatus Code Value :: " + responseEntity.getStatusCodeValue());
		System.out.println("ResponseStatus Code       :: " + responseEntity.getStatusCode().name());
		System.out.println("********************************************************");

	}
}
