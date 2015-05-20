package sKits.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		player.sendMessage(ChatColor.DARK_RED + "*********************************");
		player.sendMessage(ChatColor.DARK_GREEN + "Hi, "+ player.getName() + "! Welcome to mc4fun!");
		player.sendMessage(ChatColor.DARK_RED + "*********************************");

	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		
		player.sendMessage(ChatColor.DARK_RED + "GoodBye and soon come back to mc4fun!");
		// event.setQuitMessage(null);
	}
	
	@EventHandler
	public void onPlayerKick(PlayerKickEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.DARK_RED + "You have been kicked from mc4fun!");
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		String msg = event.getDeathMessage();
		msg = ChatColor.GOLD + msg;
		
		if(event.getEntity().getKiller() instanceof Player)
		{
			event.setDeathMessage ("[PvP] "+msg);
		} else {
			event.setDeathMessage("[PvE] "+ msg);
		}
	}
	
	@EventHandler
	public void onHunger(FoodLevelChangeEvent event) {
		event.setCancelled(true);
	}
}
