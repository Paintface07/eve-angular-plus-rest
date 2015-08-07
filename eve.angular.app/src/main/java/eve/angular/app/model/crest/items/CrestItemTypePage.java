package eve.angular.app.model.crest.items;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestLinkedPagedList;
import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestItemTypePage extends CrestLinkedPagedList implements Serializable {
	private static final long serialVersionUID = 8406119905375878501L;
	
	private List<CrestItemType> items;
}
