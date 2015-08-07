package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestMarketTypePage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = 4781058484397770320L;
	
	private List<CrestMarketTypeWrapper> items;
}
