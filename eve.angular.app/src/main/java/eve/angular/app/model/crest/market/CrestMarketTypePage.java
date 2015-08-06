package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestMarketTypePage implements Serializable {
	private static final long serialVersionUID = 4781058484397770320L;
	
	private Long totalCount;
	private Long pageCount;
	private List<CrestMarketTypeWrapper> items;
}
