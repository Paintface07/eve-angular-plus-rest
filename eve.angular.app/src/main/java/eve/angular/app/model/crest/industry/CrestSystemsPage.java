package eve.angular.app.model.crest.industry;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import eve.angular.app.model.crest.CrestPagedList;

@Data
public class CrestSystemsPage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = 5569930671071795118L;
	
	private List<CrestSystemFacilities> items;
}
