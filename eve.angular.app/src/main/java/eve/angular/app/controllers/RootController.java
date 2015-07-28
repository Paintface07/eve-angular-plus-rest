package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.EveCrestApi;

@RestController
public class RootController {
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces="application/json")
	public EveCrestApi root() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			System.out.println(">>> Response: " + api);
		
			return api;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/string", method=RequestMethod.GET, produces="application/json")
	public String string() {
		try {
			String api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, String.class);
			System.out.println(">>> Response: " + api);
		
			return api;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
