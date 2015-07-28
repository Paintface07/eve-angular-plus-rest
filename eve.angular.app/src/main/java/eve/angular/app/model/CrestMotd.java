package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestMotd implements Serializable {
	private static final long serialVersionUID = -4725174411617168058L;
	
	private EveApiLink dust;
	private EveApiLink eve;
	private EveApiLink server;
}
