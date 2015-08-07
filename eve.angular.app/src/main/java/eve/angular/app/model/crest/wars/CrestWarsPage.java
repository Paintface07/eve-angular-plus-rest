package eve.angular.app.model.crest.wars;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestLinkedPagedList;
import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestWarsPage extends CrestLinkedPagedList implements Serializable {
	private static final long serialVersionUID = -4929411010381769687L;
	
	private List<CrestWar> items;
}
