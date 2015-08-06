package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestMarketPricePage implements Serializable {
	private static final long serialVersionUID = -1459394926493904424L;
	
	private Long totalCount;
	private List<CrestMarketPrice> items;
	private Long pageCount;
}
