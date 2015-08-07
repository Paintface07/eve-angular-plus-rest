package eve.angular.app.controllers.crest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.wars.CrestWarDetails;
import eve.angular.app.model.crest.wars.CrestWarsPage;

@RestController
public class WarsController {

	@RequestMapping(value="/wars", method=RequestMethod.GET, produces="application/json")
	public CrestWarsPage wars() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestWarsPage warsPage = new RestTemplate().getForObject(api.getWars().getHref(), CrestWarsPage.class);
			System.out.println(">>> Response: " + warsPage);
		
			return warsPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/wars/{id}", method=RequestMethod.GET, produces="application/json")
	public CrestWarDetails warsById(@PathVariable Long id) {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestWarDetails war = new RestTemplate().getForObject(api.getWars().getHref() + id + "/", CrestWarDetails.class);
			System.out.println(">>> Response: " + war);
		
			return war;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
