package me.elior.halfserversleep.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.elior.halfserversleep.Main;

public class utils {
	
	public static int playersSleeping = 0;
	public static boolean isReachedToNeeded = false;

	public static class Messages {
		public static String player_went_to_sleep = ChatColor.translateAlternateColorCodes('&', Main.getPlugin(Main.class).getConfig().getString("Messages.player-went-to-sleep"));
		public static String player_exited_from_sleep = ChatColor.translateAlternateColorCodes('&', Main.getPlugin(Main.class).getConfig().getString("Messages.player-exited-from-sleep"));
		public static String all_needed_players_sleep = ChatColor.translateAlternateColorCodes('&', Main.getPlugin(Main.class).getConfig().getString("Messages.all-needed-players-sleep"));
	}
	
	public static class Settings {
		public static Boolean cancel_rain = Main.getPlugin(Main.class).getConfig().getBoolean("Settings.cancel-rain");
		public static long morning_time = Main.getPlugin(Main.class).getConfig().getLong("Settings.morning-time");
		public static int time_before_change = Main.getPlugin(Main.class).getConfig().getInt("Settings.time-before-change");
		public static String reguler_world = Main.getPlugin(Main.class).getConfig().getString("Settings.reguler-world");
	}
	
	public static String PlaceholderString(String Message, Player player, int playerSleeping, int playerSleepingNeeded) {
		return ChatColor.translateAlternateColorCodes('&', Message.replaceAll("%player_name%", player.getName()).replaceAll("%players_sleeping%", String.valueOf(playersSleeping)).replaceAll("%players_sleeping_needed%", String.valueOf(playerSleepingNeeded)));
	}
	
}
