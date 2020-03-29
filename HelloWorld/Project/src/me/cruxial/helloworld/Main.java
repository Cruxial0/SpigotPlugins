package me.cruxial.helloworld;


import org.bukkit.plugin.java.JavaPlugin;

import me.cruxial.helloworld.commands.HelloCommand;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		
		new HelloCommand(this);
		
	}
	
}
