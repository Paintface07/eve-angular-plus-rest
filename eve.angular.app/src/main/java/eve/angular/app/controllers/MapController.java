package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.map.CrestRegionPage;

@RestController
public class MapController {

	@RequestMapping(value="/regions", method=RequestMethod.GET, produces="application/json")
	public CrestRegionPage regions() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestRegionPage regionPage = new RestTemplate().getForObject(api.getRegions().getHref(), CrestRegionPage.class);
			System.out.println(">>> Response: " + regionPage);
		
			return regionPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
