package eve.angular.app.controllers.crest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.alliance.CrestAllianceDetail;
import eve.angular.app.model.crest.alliance.CrestAlliancePage;

/**
 * TODO: fix issue with resolving alliances fields
 * @author kondrak
 *
 */
@RestController
public class AlliancesController {

	@RequestMapping(value="/alliances", method=RequestMethod.GET, produces="application/json")
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
	
	@RequestMapping(value="/alliances/{id}", method=RequestMethod.GET, produces="application/json")
	public CrestAllianceDetail alliance(@PathVariable Long id) {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestAllianceDetail alliance = new RestTemplate().getForObject(api.getAlliances().getHref() + id + "/", CrestAllianceDetail.class);
			System.out.println(">>> Response: " + alliance);
		
			return alliance;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
