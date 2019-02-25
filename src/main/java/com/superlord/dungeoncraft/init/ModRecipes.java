package com.superlord.dungeoncraft.init;

import com.superlord.dungeoncraft.util.DCConfig;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.LEATHER, new ItemStack(ModItems.TANNED_LEATHER), 1.5F);
		GameRegistry.addSmelting(ModItems.COW_HIDE, new ItemStack(Items.LEATHER), 1.5F);
		GameRegistry.addSmelting(ModItems.PIG_HIDE, new ItemStack(Items.LEATHER), 1.5F);
		GameRegistry.addSmelting(ModItems.MOOSHROOM_HIDE, new ItemStack(Items.LEATHER), 1.5F);
		GameRegistry.addSmelting(ModItems.HORSE_HIDE, new ItemStack(Items.LEATHER), 1.5F);
		if (DCConfig.advancedSmelting) {
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.MOLTEN_COPPER), 1.5F);
		} else {
			GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 1.5F);

		}
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT), 1.5F);
		GameRegistry.addSmelting(ModItems.MAMMOTH_SHANK, new ItemStack(ModItems.COOKED_MAMMOTH_SHANK), 1.5F);
		GameRegistry.addSmelting(ModItems.RAW_HORSE_MEAT, new ItemStack(ModItems.COOKED_HORSE_MEAT), 1.5F);
	}
	
}
