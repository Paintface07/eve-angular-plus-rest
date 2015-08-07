package eve.angular.app.controllers.crest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.tournament.CrestTournamentsPage;

@RestController
public class TournamentsController {

	@RequestMapping(value="/tournaments", method=RequestMethod.GET, produces="application/json")
	public CrestTournamentsPage tournaments() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestTournamentsPage tournamentsPage = new RestTemplate().getForObject(api.getTournaments().getHref(), CrestTournamentsPage.class);
			System.out.println(">>> Response: " + tournamentsPage);
		
			return tournamentsPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
