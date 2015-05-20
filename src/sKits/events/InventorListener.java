package sKits.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class InventorListener implements Listener {
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Material mat = player.getItemInHand().getType();
		
		if (event.getAction() == Action.RIGHT_CLICK_AIR ||
				event.getAction() == Action.RIGHT_CLICK_BLOCK ) {
	
			if (mat == Material.MUSHROOM_SOUP) {
				ItemStack bowl = new ItemStack(Material.MUSHROOM_SOUP, 1);
				
				int food = player.getFoodLevel();
				if (food != 20) {
					int nfood = (food >12?20:food+8);
					player.setFoodLevel(nfood);
				}
				
				double health = player.getHealth();
				if (health != 20) {
					double nhealth = (health>12?20:health+8);
					player.setHealth(nhealth);
				}
				
				player.getInventory().setItem(player.getInventory().getHeldItemSlot(),bowl);
				return;
			}
			
		}
	}
}		


