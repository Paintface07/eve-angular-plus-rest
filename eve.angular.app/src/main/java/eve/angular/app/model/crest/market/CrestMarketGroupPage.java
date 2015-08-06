package eve.angular.app.model.crest.market;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestMarketGroupPage implements Serializable {
	private static final long serialVersionUID = 7122576938779675434L;
	
	private Long totalCount;
	private Long pageCount;
	private List<CrestMarketGroupDetails> items;
}
