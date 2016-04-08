package me.markeh.factionsframework.event;

import me.markeh.factionsframework.entities.FPlayer;

public class EventFactionsCreate extends BaseEventFactions<EventFactionsCreate> {

	// -------------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------------- //
	
	public EventFactionsCreate(String name, FPlayer fplayer) {
		this.name = name;
		this.fplayer = fplayer;
	}
	
	// -------------------------------------------------- //
	// FIELDS
	// -------------------------------------------------- //

	private String name;
	private final FPlayer fplayer;
	
	// -------------------------------------------------- //
	// METHODS
	// -------------------------------------------------- //

	public final String getName() {
		return this.name;
	}
	
	// There may be a way to do this using reflection/hackery 
	@Deprecated
	public final void setName(String name) {
		this.name = name;
	}
	
	public final FPlayer getFPlayer() {
		return this.fplayer;
	}
	
}
