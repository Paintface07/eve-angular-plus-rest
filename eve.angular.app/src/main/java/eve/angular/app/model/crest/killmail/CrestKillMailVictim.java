package eve.angular.app.model.crest.killmail;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestKillMailVictim implements Serializable {
	private static final long serialVersionUID = 2561376955725534488L;
	
	private String damageTaken;
	private List<CrestKillMailItemWrapper> items;
	private KillmailEntry alliance;
	private KillmailEntry character;
	private KillmailEntry shipType;
	private KillmailEntry corporation;
}
