package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class CrestLinkedPagedList extends CrestPagedList implements Serializable {
	private static final long serialVersionUID = -4224168403503272380L;
	
	@Getter @Setter private EveApiLink next;
}
