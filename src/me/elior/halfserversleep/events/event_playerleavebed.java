package me.elior.halfserversleep.events;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import me.elior.halfserversleep.utils.utils;

public class event_playerleavebed {

	public static void event(PlayerBedLeaveEvent e) {
		utils.playersSleeping -= 1;
		int neednum = Bukkit.getWorld(utils.Settings.reguler_world).getPlayers().size() / 2;
		if(neednum == 0) neednum = 1;
		if(String.valueOf(Bukkit.getWorld(utils.Settings.reguler_world).getTime()).length() != 1) {
			Bukkit.broadcastMessage(utils.PlaceholderString(utils.Messages.player_exited_from_sleep, e.getPlayer(), utils.playersSleeping, neednum));
		}
	}
	
}
