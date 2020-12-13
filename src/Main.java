package iR.yzplug.NF;

// * Import packages
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.inventory.InventoryPickupItemEvent;
import cn.nukkit.event.inventory.InventoryPickupArrowEvent;
import cn.nukkit.event.inventory.InventoryMoveItemEvent;

// public class Main extends PluginBase implements Listener
public class Main extends PluginBase implements Listener {

	// @Override and Public void onEnable
	@Override	
	public void onEnable(){
		
		// Message on Enable plugin in Console
		this.getLogger().info("Enabled Plugin InventoryPro(Dont Move Item In Inventory - Dont Get Drop Items - Dont get Arrows Shouted)");
	}
	
	// on InventoryPickupItemEvent
	public void getItemDrops(InventoryPickupItemEvent e){
		
		// canceling this Event
		e.setCancelled(true);
	}
	
	// on InventoryPickupArrowEvent
	public void onGetArrow(InventoryPickupArrowEvent event){
		
		// canceling this Event
		event.setCancelled(true);
	}
	
	// on onItemMoveInInventory
	public void onItemMoveInInventory(InventoryMoveItemEvent evnt){
		
		// canceling this event
		evnt.setCancelled(true);
	}
}
