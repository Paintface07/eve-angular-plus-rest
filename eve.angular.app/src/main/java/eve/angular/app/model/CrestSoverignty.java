package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestSoverignty implements Serializable {
	private static final long serialVersionUID = 8235984814656946725L;
	
	private EveApiLink campaigns;
	private EveApiLink structures; 
}
