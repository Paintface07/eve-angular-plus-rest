package eve.angular.app.model.crest;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestAlliancePage implements Serializable {
	private static final long serialVersionUID = 7058781764241607313L;
	
	private String totalCount_str;
	private Long pageCount;
	private List<CrestAlliance> items;
	private EveApiLink next;
	private Long totalCount;
}
