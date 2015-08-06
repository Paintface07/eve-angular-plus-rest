package eve.angular.app.model.crest.market;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestMarketHistory implements Serializable {
	private static final long serialVersionUID = 2138811039411936858L;
	
	private String volume;
	private String orderCount;
	private String lowPrice;
	private String highPrice;
	private String avgPrice;
	private String date;
}
