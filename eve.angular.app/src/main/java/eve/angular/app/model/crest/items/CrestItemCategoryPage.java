package eve.angular.app.model.crest.items;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestItemCategoryPage implements Serializable {
	private static final long serialVersionUID = 7103803713775899514L;
	
	private Long pageCount;
	private List<CrestItemCategory> items;
	private EveApiLink next;
	private Long totalCount;
}
