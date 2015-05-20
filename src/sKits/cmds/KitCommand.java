package sKits.cmds;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class KitCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player) || args.length != 1) {
			return false;
		}
		Player player = (Player) sender;
		if (args[0].equalsIgnoreCase("pvp")) {
			clearInventory(player.getInventory());
			player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET,1));
			player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE,1));
			player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS,1));
			player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS,1));
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
						
			player.sendMessage(ChatColor.DARK_GREEN + "You have chosen the basic pvp kit!");
			return true;
		} else if (args[0].equalsIgnoreCase("mine")) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
			player.getInventory().addItem(new ItemStack(Material.TORCH, 8));
			return true;
		} else if (args[0].equalsIgnoreCase("wood")) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE, 1));
			return true;
		}
		
		return false;
	}
	
	public void clearInventory(PlayerInventory inv) {
		inv.clear();
		inv.setHelmet(null);
		inv.setChestplate(null);
		inv.setLeggings(null);
		inv.setBoots(null);
	}
}
