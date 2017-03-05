package me.xDp64x;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;




public class PlayerListener implements Listener{
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		
		PlayerInventory inventory = p.getInventory();
	    //ItemStack boots = inventory.getItem(313);
	    
	    
	    
	    
	   
				
				/*
				 * See if the player has 15 levels of EXP
				 */
			
	    if(p.getLevel()>=15){
					System.out.println("Ping");
					p.setFireTicks(0);
					
					/*
					 * If location is lava
					 */
						
					
				if(p.getLocation().getBlock().getType() == org.bukkit.Material.LAVA || p.getLocation().getBlock().getType() == org.bukkit.Material.STATIONARY_LAVA){
					/*
					 * Set velocity while in lava, increasing speed
					 */
					//p.addPotionEffect((new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 10,2)));
					 Vector dir = p.getLocation().getDirection();
			          Vector vec = dir.multiply(2);
			          p.setVelocity(vec);
			          
			          
			    }
				else{
					
				}
				}
	    else{
	    	
	    }
	
	}
				}
				
					
				

	
