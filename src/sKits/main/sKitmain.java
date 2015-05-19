package sKits.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import sKits.cmds.KitCommand;
import sKits.events.PlayerListener;

public class sKitmain extends JavaPlugin {
	
	public void onEnable () {
		PluginManager pm = getServer().getPluginManager();
				
		pm.registerEvents(new PlayerListener(), this);		
		getCommand("kit").setExecutor(new KitCommand());
		
		System.out.println("sKits enabled!");
	}
	
	public void onDisable () {
		System.out.println("sKits disabled!");
	}
}
