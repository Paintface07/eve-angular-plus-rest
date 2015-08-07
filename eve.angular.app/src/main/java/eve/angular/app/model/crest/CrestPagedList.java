package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestPagedList implements Serializable {
	private static final long serialVersionUID = 6263010519240496510L;
	
	private Long totalCount;
	private Long pageCount;
}
