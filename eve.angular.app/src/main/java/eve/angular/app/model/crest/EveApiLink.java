package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data
public class EveApiLink implements Serializable {
	private static final long serialVersionUID = -8410446408479589485L;
	
	private String href;
}
