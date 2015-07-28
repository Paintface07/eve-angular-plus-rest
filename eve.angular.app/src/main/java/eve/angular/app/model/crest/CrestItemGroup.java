package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestItemGroup implements Serializable {
	private static final long serialVersionUID = 7103803713775899514L;
	
	private String href;
	private String name;
}
