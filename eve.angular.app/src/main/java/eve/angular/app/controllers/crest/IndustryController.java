package eve.angular.app.controllers.crest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.industry.CrestFacilityPage;
import eve.angular.app.model.crest.industry.CrestSystemsPage;

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
	
	@RequestMapping(value="/industry/systems", method=RequestMethod.GET, produces="application/json")
	public CrestSystemsPage industrySystems() {
		
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestSystemsPage systemsPage = new RestTemplate().getForObject(api.getIndustry().getSystems().getHref(),
					CrestSystemsPage.class);
			System.out.println(">>> Response: " + systemsPage);
		
			return systemsPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
// *** UNIMPLEMENTED ***
//	@RequestMapping(value="/industry/specialities", method=RequestMethod.GET, produces="application/json")
//	public String industrySpecialties() {
//		
//		try {
//			String specialtiesPage = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL + "/industry/specialities/",
//					String.class);
//			System.out.println(">>> Response: " + specialtiesPage);
//		
//			return specialtiesPage;
//		} catch(RestClientException ex) {
//			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
//			return null;
//		} catch(Exception ex) {
//			System.out.println("*** Exception occurred: " + ex.getMessage());
//			return null;
//		}
//	}

// *** UNIMPLEMENTED ***
//	@RequestMapping(value="/industry/teams", method=RequestMethod.GET, produces="application/json")
//	public CrestTeamsPage industryTeams() {
//		
//		try {
//			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
//			String teamsPage = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL + "/industry/teams/",
//					CrestTeamsPage.class);
//			System.out.println(">>> Response: " + teamsPage);
//		
//			return teamsPage;
//		} catch(RestClientException ex) {
//			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
//			return null;
//		} catch(Exception ex) {
//			System.out.println("*** Exception occurred: " + ex.getMessage());
//			return null;
//		}
//	}
}
