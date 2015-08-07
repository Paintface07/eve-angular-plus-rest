package eve.angular.app.controllers.crest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;

@RestController
@RequestMapping("/motd")
public class MotdController {

	@RequestMapping(value="/dust", method=RequestMethod.GET, produces="application/json")
	public String dustMotd() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			String dust = new RestTemplate().getForObject(api.getMotd().getDust().getHref(), String.class);
			System.out.println(">>> Response: " + dust.toString());
		
			return dust;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server dust motd endpoint.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	/**
	 * TODO: Will need to add endpoints for the contained resources as well.  This endpoint is likely
	 * not entirely plausible for this purpose.
	 * @return
	 */
	@RequestMapping(value="/eve", method=RequestMethod.GET, produces="text/html")
	public String eveMotd() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			String eve = new RestTemplate().getForObject(api.getMotd().getEve().getHref(), String.class);
			System.out.println(">>> Response: " + eve);
		
			return eve;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server dust motd endpoint.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
