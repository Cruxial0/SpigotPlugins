package me.cruxial.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.cruxial.listeners.events.DeathListener;
import me.cruxial.listeners.events.JoinListener;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		saveDefaultConfig();
		
		new JoinListener(this);
		new DeathListener(this);
	}
	
}
