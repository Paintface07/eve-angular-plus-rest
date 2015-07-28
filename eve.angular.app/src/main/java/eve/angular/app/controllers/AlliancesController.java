package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.CrestAlliancePage;
import eve.angular.app.model.crest.EveCrestApi;

/**
 * TODO: fix issue with resolving alliances fields
 * @author kondrak
 *
 */
@RestController
@RequestMapping("/alliances")
public class AlliancesController {

	@RequestMapping(value="/", method=RequestMethod.GET, produces="application/json")
	public CrestAlliancePage alliances() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestAlliancePage alliancePage = new RestTemplate().getForObject(api.getAlliances().getHref(), CrestAlliancePage.class);
			System.out.println(">>> Response: " + alliancePage);
		
			return alliancePage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
