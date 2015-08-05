package eve.angular.app.model.crest.tournament;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestTournamentsPage implements Serializable {
	private static final long serialVersionUID = 7918621404269933897L;
	
	private Long pageCount;
	private Long totalCount;
	private List<CrestTournament> items;
}
