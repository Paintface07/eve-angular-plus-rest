package eve.angular.app.model.crest.killmail;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestKillMailItemWrapper implements Serializable {
	private static final long serialVersionUID = -3785033484017718953L;
	
	private Integer singleton;
	private KillmailEntry itemType;
	private Long quantityDestroyed;
	private String flag;
}
