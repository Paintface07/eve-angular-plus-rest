package eve.angular.app.model.crest.killmail;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.wars.CrestWar;
import lombok.Data;

@Data
public class CrestKillMail implements Serializable {
	private static final long serialVersionUID = -3221439455455050153L;
	
	private Long killID;
	private String killTime;
	private CrestKillMailSolarSystem solarSystem;
	private List<CrestKillMailAttacker> attackers;
	private Long attackerCount;
	private CrestKillMailVictim victim;
	private CrestWar war;
}
