package eve.angular.app.model.crest.industry;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestSystem;
import lombok.Data;

@Data
public class CrestSystemFacilities implements Serializable {
	private static final long serialVersionUID = -6035311077317054313L;
	
	private List<CrestCostIndex> systemCostIndices;
	private CrestSystem solarSystem;
}
