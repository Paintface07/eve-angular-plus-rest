package eve.angular.app.model.crest;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CrestLogo implements Serializable {
	private static final long serialVersionUID = 3234263312551618696L;

	@JsonProperty("32x32") private EveApiLink tiny;
	@JsonProperty("64x64") private EveApiLink small;
	@JsonProperty("128x128") private EveApiLink medium;
	@JsonProperty("256x256") private EveApiLink large;
}
