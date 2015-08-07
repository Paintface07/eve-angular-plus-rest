package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.industry.CrestFacilityPage;

@RestController
public class IndustryController {

	@RequestMapping(value="/industry/facilities", method=RequestMethod.GET, produces="application/json")
	public CrestFacilityPage industryFacilities() {
		
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestFacilityPage facilityPage = new RestTemplate().getForObject(api.getIndustry().getFacilities().getHref(),
					CrestFacilityPage.class);
			System.out.println(">>> Response: " + facilityPage);
		
			return facilityPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
