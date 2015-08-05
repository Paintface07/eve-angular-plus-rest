package eve.angular.app.model.crest.map;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data	// TODO: resolve this issue by implementing proper equals/hashcode
public class CrestRegion extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 7103803713775899514L;
	
	private String name;
}
