package eve.angular.app.model.crest.tournament;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestTournament implements Serializable {
	private static final long serialVersionUID = 2615834727246773127L;
	
	private CrestTournamentInfo href;
}
