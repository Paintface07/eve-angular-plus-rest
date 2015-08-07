package eve.angular.app.model.crest.industry;

import java.io.Serializable;

import eve.angular.app.model.crest.CrestIdReference;
import lombok.Data;

@Data
public class CrestFacilityDetail implements Serializable {
	private static final long serialVersionUID = -1374556039313212657L;
	
	private Long facilityID;
	private CrestIdReference solarSystem;
	private String name;
	private CrestIdReference region;
	private String tax;
	private CrestIdReference owner;
	private CrestIdReference type;
}
