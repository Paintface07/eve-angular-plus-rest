package eve.angular.app.model.crest.alliance;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;
import lombok.Data;

@Data	// TODO: resolve this issue by implementing proper proper equals/hashcode
public class CrestAlliance extends EveApiLink implements Serializable {
	private static final long serialVersionUID = -1300496323651728477L;
	
	private Long id;
	private String shortName;
	private String href;
	private String name;
}
