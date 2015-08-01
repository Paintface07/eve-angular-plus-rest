package eve.angular.app.model.crest.wars;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestWarsPage implements Serializable {
	private static final long serialVersionUID = -4929411010381769687L;
	
	private Long totalCount;
	private Long pageCount;
	private List<CrestWar> items;
	private EveApiLink next;
}
