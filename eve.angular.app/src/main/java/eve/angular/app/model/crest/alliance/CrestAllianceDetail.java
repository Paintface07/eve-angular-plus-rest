package eve.angular.app.model.crest.alliance;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestCharacter;
import eve.angular.app.model.crest.CrestCorporation;
import lombok.Data;

@Data
public class CrestAllianceDetail implements Serializable {
	private static final long serialVersionUID = -4387441639956973304L;
	
	private Long id;
	private String name;
	private String shortName;
	private String startDate;
	private Long corporationsCount;
	private String description;
	private CrestCorporation executorCorporation;
	private Boolean deleted;
	private CrestCorporation creatorCorporation;
	private String url;
	private CrestCharacter creatorCharacter;
	private List<CrestCorporation> corporations;
	
}
