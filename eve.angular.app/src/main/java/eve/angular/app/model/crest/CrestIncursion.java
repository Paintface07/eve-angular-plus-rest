package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestIncursion implements Serializable {
	private static final long serialVersionUID = -1469097772087514267L;
	
	private Long influence;
	private Boolean hasBoss;
	private String state;
	private CrestSystem stagingSolarSystem;
}
