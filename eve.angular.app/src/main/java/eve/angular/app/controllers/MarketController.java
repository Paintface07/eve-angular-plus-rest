package eve.angular.app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import eve.angular.app.config.EveApiConfiguration;
import eve.angular.app.model.crest.market.CrestMarketHistoryPage;

@RestController
public class MarketController {

	@RequestMapping(value="/market/{regionId}/types/{typeId}/history", method=RequestMethod.GET, produces="application/json")
	public CrestMarketHistoryPage regions(@PathVariable Long regionId, @PathVariable Long typeId) {
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
}
