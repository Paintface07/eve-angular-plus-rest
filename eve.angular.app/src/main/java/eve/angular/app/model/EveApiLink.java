package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EveApiLink implements Serializable {
	private static final long serialVersionUID = -8410446408479589485L;
	
	private String href;
}
