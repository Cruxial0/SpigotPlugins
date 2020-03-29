package me.cruxial.listeners.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.cruxial.listeners.Main;
import me.cruxial.listeners.utils.Utils;

public class DeathListener implements Listener{

	@SuppressWarnings("unused")
	private Main plugin;
	
	public DeathListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if(e.getEntity().getKiller() instanceof Player) {
			
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			killer.sendMessage(Utils.chat("&8 [&3*&8] &7You killed  &6" + p.getName() + ". &7What a loser."));
			p.sendMessage(Utils.chat("&8[&c*&8] &7You were killed by  &c" + killer.getName()));
			return;
		}
	}
}

