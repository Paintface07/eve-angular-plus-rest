package eve.angular.app.model.crest.killmail;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import eve.angular.app.model.crest.EveApiLink;

public class KillmailEntry extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 3995714932946190321L;
	
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	@Getter @Setter private EveApiLink icon;
}
