package eve.angular.app.model.crest.incursion;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CrestIncursionPage implements Serializable {
	private static final long serialVersionUID = -7162855951269987267L;
	
	private Long totalCount;
	private Long pageCount;
	private List<CrestIncursion> items;		// TODO: refactor these paged objects into a generic paged abstraction
}
