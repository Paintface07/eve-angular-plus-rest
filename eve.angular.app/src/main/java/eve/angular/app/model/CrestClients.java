package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestClients implements Serializable {
	private static final long serialVersionUID = -2187416596169215261L;
	
	private EveApiLink dust;
	private EveApiLink eve;
}
