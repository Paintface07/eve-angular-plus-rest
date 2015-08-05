package eve.angular.app.model.crest.killmail;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Getter;
import lombok.Setter;

public class CrestKillMailSolarSystem extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 8234212442659436489L;
	
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
}
