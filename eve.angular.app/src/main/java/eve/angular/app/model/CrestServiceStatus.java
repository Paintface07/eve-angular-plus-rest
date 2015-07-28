package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestServiceStatus implements Serializable {
	private static final long serialVersionUID = -2347907842429339205L;
	
	private String dust;
	private String eve;
	private String server;
}
