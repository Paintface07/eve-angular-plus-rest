package eve.angular.app.model.crest.industry;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestCostIndex implements Serializable {
	private static final long serialVersionUID = 5937729798214934644L;
	
	private String costIndex;
	private Long activityID;
	private String activityName;
}
