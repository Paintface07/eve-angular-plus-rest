package eve.angular.app.model.crest.killmail;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestKillMailAttacker implements Serializable {
	private static final long serialVersionUID = -4657007023422699582L;
	
	private KillmailEntry alliance;
	private KillmailEntry shipType;
	private KillmailEntry corporation;
	private KillmailEntry character;
	private String damageDone;
	private KillmailEntry weaponType;
	private Boolean finalBlow;
	private String securityStatus;
}
