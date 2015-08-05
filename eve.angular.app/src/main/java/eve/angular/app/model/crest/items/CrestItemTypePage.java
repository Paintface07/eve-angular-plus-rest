package eve.angular.app.model.crest.items;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestItemTypePage implements Serializable {
	private static final long serialVersionUID = 8406119905375878501L;
	
	private Long pageCount;
	private List<CrestItemType> items;
	private EveApiLink next;
	private Long totalCount;
}
