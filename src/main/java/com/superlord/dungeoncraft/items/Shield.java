package com.superlord.dungeoncraft.items;

import com.superlord.dungeoncraft.Main;
import com.superlord.dungeoncraft.init.ModItems;

import net.minecraft.item.ItemShield;

public class Shield extends ItemShield {

	public Shield(String name) {
		setUnlocalizedName(name);
		this.setMaxDamage(200);
		setRegistryName(name);
		setCreativeTab(Main.dungeoncraft);
		
		ModItems.ITEMS.add(this);
	}
	
}
