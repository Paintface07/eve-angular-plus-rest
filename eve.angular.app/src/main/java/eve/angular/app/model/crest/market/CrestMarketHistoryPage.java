package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestMarketHistoryPage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = -7458350284751005915L;
	
	private List<CrestMarketHistory> items;
}
