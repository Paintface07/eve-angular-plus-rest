package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestMarketGroupPage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = 7122576938779675434L;
	
	private List<CrestMarketGroupDetails> items;
}
