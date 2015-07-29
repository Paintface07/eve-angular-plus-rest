package eve.angular.app.model.crest.items;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data	// TODO: resolve this issue by implementing proper equals/hashcode
public class CrestItemGroup extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 7103803713775899514L;
	
	private String name;
}
