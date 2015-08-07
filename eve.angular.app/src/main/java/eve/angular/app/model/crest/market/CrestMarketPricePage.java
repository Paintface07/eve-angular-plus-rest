package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestMarketPricePage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = -1459394926493904424L;
	
	private List<CrestMarketPrice> items;
}
