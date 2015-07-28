package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;

/**
 * TODO: may need to be renamed to be more encompassing of corporation data when
 * the endpoints are implemented by CCP
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/corporation_roles")
public class CorporationRolesController {
	
	/**
	 * This endpoint has not yet been implemented by CCP.  This will 404 and return nothing
	 * @return
	 */
	@RequestMapping("/")
	public String corporationRoles() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			String corporationRoles = new RestTemplate().getForObject(api.getCorporationRoles().getHref(), String.class);
			System.out.println(">>> Response: " + corporationRoles);
		
			return corporationRoles;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server corporation roles endpoint.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
