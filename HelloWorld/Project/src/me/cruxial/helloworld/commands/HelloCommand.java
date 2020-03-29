package me.cruxial.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.cruxial.helloworld.Main;

public class HelloCommand implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command!");
			return true;
		}
		
		Player p = (Player)sender;
		
		if(p.hasPermission("hello.use")) {
			
			p.sendMessage("Hello, " + p.getName() + "!");
			
			return true;
		} else {
			
			p.sendMessage("You don't have permission to exectue this command!");
			
		}
		return false;
	}

}
