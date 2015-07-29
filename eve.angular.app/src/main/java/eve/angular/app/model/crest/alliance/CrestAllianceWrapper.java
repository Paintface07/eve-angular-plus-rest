package eve.angular.app.model.crest.alliance;

import java.io.Serializable;

import lombok.Data;

/**
 * A wrapper for CrestAlliances which seem to be in a wrapper with the unfortunate name of
 * "href".  TODO: try treating this wrapper as a string to debug issues with wrapping "href".
 * @author kondrak
 *
 */
@Data
public class CrestAllianceWrapper implements Serializable {
	private static final long serialVersionUID = -1300496323651728477L;
	
	private CrestAlliance href;
}
