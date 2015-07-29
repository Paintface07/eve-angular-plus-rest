package eve.angular.app.model.crest.alliance;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestAlliancePage implements Serializable {
	private static final long serialVersionUID = 7058781764241607313L;
	
	private Long pageCount;
	private List<CrestAllianceWrapper> items;
//	private String[] items;
	private EveApiLink next;
	private Long totalCount;
}
