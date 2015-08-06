package eve.angular.app.model.crest.market;

import java.io.Serializable;

import eve.angular.app.model.crest.EveApiLink;

public class CrestMarketType extends EveApiLink implements Serializable {
	private static final long serialVersionUID = 6928078244570430645L;
	
	private Long id;
	private String name;
	private EveApiLink icon;
}
