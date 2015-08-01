package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data		// TODO: fix this by properly implementing equals/hashCode
public class CrestSystem extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 3231415099534922989L;
	
	private Long id;
	private String name;
}
