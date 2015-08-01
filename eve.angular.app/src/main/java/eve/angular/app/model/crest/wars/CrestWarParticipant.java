package eve.angular.app.model.crest.wars;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data	// TODO: fix this by implementing proper 
public class CrestWarParticipant extends EveApiLink implements Serializable {
	private static final long serialVersionUID = -1382664114069593732L;
	
	private Long id;
	private Long shipsKilled;
	private String name;
	private EveApiLink icon;
	private Long iskKilled;
}
