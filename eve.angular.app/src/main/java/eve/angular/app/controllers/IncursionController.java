package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.CrestIncursionPage;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.wars.CrestWarsPage;

@RestController
public class IncursionController {

	@RequestMapping(value="/incursions", method=RequestMethod.GET, produces="application/json")
	public CrestIncursionPage alliances() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestIncursionPage incursions = new RestTemplate().getForObject(api.getIncursions().getHref(), CrestIncursionPage.class);
			System.out.println(">>> Response: " + incursions);
		
			return incursions;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
