package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.killmail.CrestKillMail;
import eve.angular.app.model.crest.tournament.CrestTournamentsPage;

@RestController
public class KillmailController {
	
	@RequestMapping(value="/killmails/{killId}/{hash}", method=RequestMethod.GET, produces="application/json")
	public CrestKillMail killmails(@PathVariable Long killId, @PathVariable String hash) {
		try {
			String killmailUrl = EveApiConfiguration.BASE_URL + "/killmails/" + killId + "/" + hash + "/";
			CrestKillMail killmail = new RestTemplate().getForObject(killmailUrl, CrestKillMail.class);
			System.out.println(">>> Response: " + killmail);
		
			return killmail;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
