package me.elior.halfserversleep.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class EventManager implements Listener {
	
	@EventHandler
	public void PlayerBedEnterEvent(PlayerBedEnterEvent e) throws InterruptedException {
		event_playerenterbed.event(e);
	}
	
	@EventHandler
	public void PlayerBedLeaveEvent(PlayerBedLeaveEvent e) {
		event_playerleavebed.event(e);
	}
	
}
