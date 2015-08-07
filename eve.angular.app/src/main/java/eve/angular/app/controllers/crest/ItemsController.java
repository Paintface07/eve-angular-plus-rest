package eve.angular.app.controllers.crest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.items.CrestItemCategoryPage;
import eve.angular.app.model.crest.items.CrestItemGroupPage;
import eve.angular.app.model.crest.items.CrestItemTypePage;

@RestController
public class ItemsController {
	
	@RequestMapping(value="/inventory/groups", method=RequestMethod.GET, produces="application/json")
	public CrestItemGroupPage itemGroups() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestItemGroupPage itemGroups = new RestTemplate().getForObject(api.getItemGroups().getHref(), CrestItemGroupPage.class);
			System.out.println(">>> Response: " + itemGroups);
		
			return itemGroups;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/types", method=RequestMethod.GET, produces="application/json")
	public CrestItemTypePage itemTypes() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestItemTypePage itemTypes = new RestTemplate().getForObject(api.getItemTypes().getHref(), CrestItemTypePage.class);
			System.out.println(">>> Response: " + itemTypes);
		
			return itemTypes;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/inventory/categories", method=RequestMethod.GET, produces="application/json")
	public CrestItemCategoryPage itemCategories() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestItemCategoryPage itemTypes = new RestTemplate().getForObject(api.getItemCategories().getHref(), CrestItemCategoryPage.class);
			System.out.println(">>> Response: " + itemTypes);
		
			return itemTypes;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
