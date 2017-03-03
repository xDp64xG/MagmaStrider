package me.xDp64x;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerListener implements Listener{
	public PlayerListener(Main plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	

	@EventHandler
	public void MagmaStrider(PlayerToggleSneakEvent event){
		Player player = event.getPlayer();
		
		PlayerInventory inventory = player.getInventory();
		ItemStack boots = inventory.getItem(313);
		 boolean Magma = boots.containsEnchantment(Enchantment.DEPTH_STRIDER);
		Magma=false;
		
		if(boots.containsEnchantment(Enchantment.DEPTH_STRIDER)){
			//player.addPotionEffect(PotionEffectType.LEVITATION(1,1, 1));
			
			 
	       
	     
	        
	        
	         Magma=true;
		}
		if(Magma==true){
			//player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 5, 1));
			player.setWalkSpeed(1);
		}
		else{
			Magma=false;
		}
		
		
		
		
			
	}
	}

