package eve.angular.app.model.crest;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestItemGroupPage implements Serializable {
	private static final long serialVersionUID = 7103803713775899514L;
	
	private String totalCount_str;
	private Long pageCount;
	private List<CrestItemGroup> items;
	private EveApiLink next;
	private Long totalCount;
}
