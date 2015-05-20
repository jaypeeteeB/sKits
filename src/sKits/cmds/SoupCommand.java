package sKits.cmds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import sKits.main.sKitmain;

public class SoupCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			return false;
		}
		final Player player = (Player) sender;
		player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 120, 3));
		player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 120, 3));
		player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 3));
		
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(sKitmain.inst, new Runnable() {		
				@Override
				public void run() {
					// private int i=0;
					// for (i=0; i++; i<9)
					player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
					player.sendMessage(ChatColor.DARK_GREEN + "You have been given some soup!");
				}
		}, 100L);
		return true;
		}	
}
