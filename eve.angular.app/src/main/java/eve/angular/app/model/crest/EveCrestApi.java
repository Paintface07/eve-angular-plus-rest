package eve.angular.app.model.crest;

import java.io.Serializable;

import lombok.Data;

@Data
public class EveCrestApi implements Serializable {
	private static final long serialVersionUID = -4811096636881937713L;
	
	private CrestMotd motd;
	private EveApiLink crestEndpoint;
	private EveApiLink corporationRoles;	// not working, currently 404
	private EveApiLink itemGroups;
	private EveApiLink channels;			// not working, currently 404
	private EveApiLink corporations;		// not working, currently 404
	private EveApiLink alliances;
	private EveApiLink itemTypes;
	private EveApiLink decode;				// not working
	private EveApiLink battleTheatres;
	private EveApiLink marketPrices;
	private EveApiLink itemCategories;
	private EveApiLink regions;
	private EveApiLink bloodlines;
	private EveApiLink marketGroups;
	private CrestSoverignty sovereignty;
	private EveApiLink tournaments;
	private EveApiLink map;					// not working
	private EveApiLink virtualGoodStore;
	private String serverVersion;
	private EveApiLink wars;
	private EveApiLink incursions;
	private EveApiLink races;
	private EveApiLink authEndpoint;
	private CrestServiceStatus serviceStatus;
	private CrestUserCounts userCounts;
	private CrestIndustry industry;
	private CrestClients clients;
	private EveApiLink time;				// not working
	private EveApiLink marketTypes;
	private String serverName;
}