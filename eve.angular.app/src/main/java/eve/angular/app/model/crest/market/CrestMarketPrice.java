package eve.angular.app.model.crest.market;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestMarketPrice implements Serializable {
	private static final long serialVersionUID = 8853391419777744665L;
	
	private String adjustedPrice;
	private String averagePrice;
	private CrestMarketTypeWrapper type;
}
