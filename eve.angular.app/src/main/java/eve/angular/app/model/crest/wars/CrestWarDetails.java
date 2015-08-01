package eve.angular.app.model.crest.wars;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrestWarDetails implements Serializable {
	private static final long serialVersionUID = 4230222941322735731L;

	private Long id;
	private String timeFinished;
	private Boolean openForAllies;
	private String timeStarted;
	private Long allyCount;
	private String timeDeclared;
	private CrestWarParticipant aggressor;
	private Boolean mutual;
	private String killmails;
	private CrestWarParticipant defender;
}
