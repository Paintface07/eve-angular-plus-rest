package eve.angular.app.model.crest.tournament;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data
public class CrestTournamentInfo implements Serializable {
	private static final long serialVersionUID = 6367059143969451765L;
	
	private EveApiLink href;
	private String name;
}
