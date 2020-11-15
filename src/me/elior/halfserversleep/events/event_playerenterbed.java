package me.elior.halfserversleep.events;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.player.PlayerBedEnterEvent;

import me.elior.halfserversleep.Main;
import me.elior.halfserversleep.utils.utils;

public class event_playerenterbed {

	public static void event(PlayerBedEnterEvent e) {
		if(e.getBedEnterResult() != PlayerBedEnterEvent.BedEnterResult.OK) return;
		utils.playersSleeping += 1;
		final int neednum = (Bukkit.getWorld(utils.Settings.reguler_world).getPlayers().size() / 2 == 0) ? 1 : Bukkit.getWorld(utils.Settings.reguler_world).getPlayers().size() / 2;
		Bukkit.broadcastMessage(utils.PlaceholderString(utils.Messages.player_went_to_sleep, e.getPlayer(), utils.playersSleeping, neednum));
		if(utils.playersSleeping >= neednum && !utils.isReachedToNeeded) {	
			Bukkit.broadcastMessage(utils.PlaceholderString(utils.Messages.all_needed_players_sleep, e.getPlayer(), utils.playersSleeping, neednum));
			utils.isReachedToNeeded = true;
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(Main.class), new Runnable() { public void run() {
				if(utils.playersSleeping >= neednum) {
					World world = Bukkit.getWorld(utils.Settings.reguler_world);
					world.setTime(utils.Settings.time_before_change);
					if(world.getWeatherDuration() != 0 || world.isThundering() && utils.Settings.cancel_rain) {
						world.setWeatherDuration(0060);
						world.setThunderDuration(0060);
					}
					utils.isReachedToNeeded = false;
				} else {
					utils.isReachedToNeeded = false;
				}
				} }, (utils.Settings.time_before_change * 20));
		}
	}
}
