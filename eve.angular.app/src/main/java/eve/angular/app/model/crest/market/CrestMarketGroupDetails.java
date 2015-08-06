package eve.angular.app.model.crest.market;

import java.io.Serializable;

import lombok.Data;
import eve.angular.app.model.crest.EveApiLink;

@Data		// TODO: fix this by properly implementing hashCode and equals
public class CrestMarketGroupDetails extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 1342835310427705194L;
	
	private String name;
	private EveApiLink types;
	private String description;
}
