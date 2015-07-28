package eve.angular.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class EveCrestApi implements Serializable {
	private static final long serialVersionUID = -4811096636881937713L;
	
	private CrestMotd motd;
	private EveApiLink crestEndpoint;
	private EveApiLink corporationRoles;
	private EveApiLink itemGroups;
	private EveApiLink channels;
	private EveApiLink corporations;
	private EveApiLink alliances;
	private EveApiLink itemTypes;
	private EveApiLink decode;
	private EveApiLink battleTheatres;
	private EveApiLink marketPrices;
	private EveApiLink itemCategories;
	private EveApiLink regions;
	private EveApiLink bloodlines;
	private EveApiLink marketGroups;
	private CrestSoverignty sovereignty;
	private EveApiLink tournaments;
	private EveApiLink map;
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
	private EveApiLink time;
	private EveApiLink marketTypes;
	private String serverName;
}