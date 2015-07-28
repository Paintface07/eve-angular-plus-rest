package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestAlliance implements Serializable {
	private static final long serialVersionUID = -1300496323651728477L;
	
	private Long id;
	private String shortName;
	private String href;
	private String name;
}
