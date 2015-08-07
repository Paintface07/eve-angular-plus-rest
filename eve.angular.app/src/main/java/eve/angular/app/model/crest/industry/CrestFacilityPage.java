package eve.angular.app.model.crest.industry;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestFacilityPage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = 477550541228446431L;
	
	private List<CrestFacilityDetail> items;
}
