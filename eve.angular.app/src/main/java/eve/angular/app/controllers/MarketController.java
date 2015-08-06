package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.CrestPage;
import eve.angular.app.model.crest.EveCrestApi;
import eve.angular.app.model.crest.market.CrestMarketGroupDetails;
import eve.angular.app.model.crest.market.CrestMarketGroupPage;
import eve.angular.app.model.crest.market.CrestMarketHistoryPage;
import eve.angular.app.model.crest.market.CrestMarketPricePage;
import eve.angular.app.model.crest.market.CrestMarketTypePage;

@RestController
public class MarketController {

	@RequestMapping(value="/market/{regionId}/types/{typeId}/history", method=RequestMethod.GET, produces="application/json")
	public CrestMarketHistoryPage marketHistory(@PathVariable Long regionId, @PathVariable Long typeId) {
		try {
			String marketHistoryUrl = EveApiConfiguration.BASE_URL + "/market/" + regionId + "/types/" + typeId + "/history/";
			CrestMarketHistoryPage marketHistoryPage = new RestTemplate().getForObject(marketHistoryUrl, CrestMarketHistoryPage.class);
			System.out.println(">>> Response: " + marketHistoryPage);
		
			return marketHistoryPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/market/groups", method=RequestMethod.GET, produces="application/json")
	public CrestMarketGroupPage marketGroups() {
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestMarketGroupPage marketHistoryPage = new RestTemplate().getForObject(api.getMarketGroups().getHref(), CrestMarketGroupPage.class);
			System.out.println(">>> Response: " + marketHistoryPage);
		
			return marketHistoryPage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/market/prices", method=RequestMethod.GET, produces="application/json")
	public CrestMarketPricePage marketPrices() {
		
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestMarketPricePage marketPricePage = new RestTemplate().getForObject(api.getMarketPrices().getHref(), CrestMarketPricePage.class);
			System.out.println(">>> Response: " + marketPricePage);
		
			return marketPricePage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value="/market/types", method=RequestMethod.GET, produces="application/json")
	public CrestMarketTypePage marketTypes() {
		
		try {
			EveCrestApi api = new RestTemplate().getForObject(EveApiConfiguration.BASE_URL, EveCrestApi.class);
			CrestMarketTypePage marketPricePage = new RestTemplate().getForObject(api.getMarketTypes().getHref(), CrestMarketTypePage.class);
			System.out.println(">>> Response: " + marketPricePage);
		
			return marketPricePage;
		} catch(RestClientException ex) {
			System.out.println("*** Could not reach EVE API server.  " + ex.getMessage());
			return null;
		} catch(Exception ex) {
			System.out.println("*** Exception occurred: " + ex.getMessage());
			return null;
		}
	}
}
