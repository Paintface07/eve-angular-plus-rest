package eve.angular.app.model.crest.tournament;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestTournamentsPage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = 7918621404269933897L;
	
	private List<CrestTournament> items;
}
