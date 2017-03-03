package me.xDp64x;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable(){
		 Bukkit.getPluginManager.registerEvents(new PlayerListener(), this);
	}
	@Override
	public void onDisable(){
		
	}
}
