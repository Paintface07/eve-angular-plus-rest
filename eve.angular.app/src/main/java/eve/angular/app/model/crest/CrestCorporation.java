package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data	// TODO: resolve this issue by implementing proper proper equals/hashcode
public class CrestCorporation extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 5895363474785226597L;
	
	private Long id;
	private String name;
	private Boolean isNPC;
	private CrestLogo logo;
}
