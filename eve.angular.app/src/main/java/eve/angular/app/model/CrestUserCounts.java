package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestUserCounts implements Serializable {
	private static final long serialVersionUID = -4781832967661507691L;
	
	private Long dust;
	private Long eve;
}
