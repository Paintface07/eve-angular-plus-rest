package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestMarketHistoryPage implements Serializable {
	private static final long serialVersionUID = -7458350284751005915L;
	
	private Long totalCount;
	private Long pageCount;
	private List<CrestMarketHistory> items;
}
