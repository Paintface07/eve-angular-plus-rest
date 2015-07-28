package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestIndustry implements Serializable {
	private static final long serialVersionUID = 4138994860861586136L;
	
	private EveApiLink facilities;
	private EveApiLink systems;
}
