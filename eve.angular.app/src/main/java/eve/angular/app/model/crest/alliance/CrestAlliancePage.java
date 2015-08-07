package eve.angular.app.model.crest.alliance;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestLinkedPagedList;
import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestAlliancePage extends CrestLinkedPagedList implements Serializable {
	private static final long serialVersionUID = 7058781764241607313L;
	
	private List<CrestAllianceWrapper> items;
}
