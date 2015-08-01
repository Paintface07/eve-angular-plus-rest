package eve.angular.app.model.crest.wars;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data	// TODO: fix this by implementing proper hashCode/equals
public class CrestWar extends EveApiLink implements Serializable {
	private static final long serialVersionUID = -5602376572641027953L;
	
	private Long id;
}
