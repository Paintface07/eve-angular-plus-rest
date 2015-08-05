package eve.angular.app.model.crest.alliance;

import java.io.Serializable;

import eve.angular.app.model.crest.CrestLogo;
import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data		// TODO: fix this by implementing actual equals/hashCode
public class CrestAllianceCharacter extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 4014673088910235231L;
	
	private Long id;
	private String name;
	private Boolean isNPC;
	private EveApiLink capsuleer;
	private CrestLogo portrait;
}
