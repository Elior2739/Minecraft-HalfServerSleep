package me.elior.halfserversleep.events;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerBedEnterEvent;

import me.elior.halfserversleep.Main;
import me.elior.halfserversleep.utils.utils;

public class event_playerenterbed {

	public static void event(PlayerBedEnterEvent e) {
		if(e.getBedEnterResult() != PlayerBedEnterEvent.BedEnterResult.OK) return;
		utils.playersSleeping += 1;
		int neednum = Bukkit.getWorld(utils.Settings.reguler_world).getPlayers().size() / 2;
		if(neednum == 0) neednum = 1;
		Bukkit.broadcastMessage(utils.PlaceholderString(utils.Messages.player_went_to_sleep, e.getPlayer(), utils.playersSleeping, neednum));
		if(neednum >= utils.playersSleeping) {	
			Bukkit.broadcastMessage(utils.PlaceholderString(utils.Messages.all_needed_players_sleep, e.getPlayer(), utils.playersSleeping, neednum));
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(Main.class), new Runnable() { public void run() { Bukkit.getWorld(utils.Settings.reguler_world).setTime(utils.Settings.time_before_change); } }, (utils.Settings.time_before_change * 20));
		
		}
		
	}
	
}
