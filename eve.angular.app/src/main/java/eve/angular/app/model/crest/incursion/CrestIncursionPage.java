package eve.angular.app.model.crest.incursion;

import java.io.Serializable;
import java.util.List;

import eve.angular.app.model.crest.CrestPagedList;
import lombok.Data;

@Data
public class CrestIncursionPage extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = -7162855951269987267L;
	
	private List<CrestIncursion> items;		// TODO: refactor these paged objects into a generic paged abstraction
}
