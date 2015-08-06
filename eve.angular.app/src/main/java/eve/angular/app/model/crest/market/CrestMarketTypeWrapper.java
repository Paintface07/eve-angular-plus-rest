package eve.angular.app.model.crest.market;

import java.io.Serializable;

import lombok.Data;
import eve.angular.app.model.crest.EveApiLink;

@Data		// TODO: fix this by properly implementing hashCode/equals
public class CrestMarketTypeWrapper implements Serializable {
	private static final long serialVersionUID = -4368008516412718052L;
	
	public CrestMarketGroup marketGroup;
	public CrestMarketType type;
}
