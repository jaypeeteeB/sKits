package sKits.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import sKits.cmds.KitCommand;
import sKits.cmds.SoupCommand;
import sKits.events.InventorListener;
import sKits.events.PlayerListener;

public class sKitmain extends JavaPlugin {
	public static sKitmain inst;
	
	public void onEnable () {
		PluginManager pm = getServer().getPluginManager();
		inst = this;
		
		pm.registerEvents(new PlayerListener(), this);		
		pm.registerEvents(new InventorListener(), this);
		getCommand("kit").setExecutor(new KitCommand());
		getCommand("soup").setExecutor(new SoupCommand());
		
		System.out.println("sKits enabled!");
	}
	
	public void onDisable () {
		System.out.println("sKits disabled!");
	}
}
