package sKits.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		player.sendMessage(ChatColor.DARK_RED + "*********************************");
		player.sendMessage(ChatColor.DARK_GREEN + "Hi, "+ player.getName() + "! Welcome to mc4fun!");
		player.sendMessage(ChatColor.DARK_RED + "*********************************");

	}
}
