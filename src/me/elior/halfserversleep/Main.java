package me.elior.halfserversleep;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.elior.halfserversleep.events.EventManager;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		Bukkit.getPluginManager().registerEvents(new EventManager(), this);
	}
	
}
