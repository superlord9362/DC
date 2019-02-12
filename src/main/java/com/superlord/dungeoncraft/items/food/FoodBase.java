package com.superlord.dungeoncraft.items.food;

import com.superlord.dungeoncraft.Main;
import com.superlord.dungeoncraft.init.ModItems;
import com.superlord.dungeoncraft.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount, saturation, isAnimalFood);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.dungeoncraft);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
