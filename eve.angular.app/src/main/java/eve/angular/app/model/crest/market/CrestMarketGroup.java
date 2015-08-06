package eve.angular.app.model.crest.market;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Getter;
import lombok.Setter;

public class CrestMarketGroup extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 8264281271069940020L;
	
	@Getter @Setter private Long id;
}
