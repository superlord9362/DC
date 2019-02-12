package com.superlord.dungeoncraft.init;

import java.util.ArrayList;
import java.util.List;

import com.superlord.dungeoncraft.items.ItemBase;
import com.superlord.dungeoncraft.items.ItemBucket;
import com.superlord.dungeoncraft.items.ItemFireScroll;
import com.superlord.dungeoncraft.items.ItemUndeadScroll;
import com.superlord.dungeoncraft.items.Shield;
import com.superlord.dungeoncraft.items.Staff;
import com.superlord.dungeoncraft.items.food.FoodBase;
import com.superlord.dungeoncraft.items.tools.ToolSpear;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item GOLD_RING = new ItemBase("gold_ring");
	public static final Item CHAIN = new ItemBase("chain");
	public static final Item FIRE_SCROLL = new ItemFireScroll("fire_scroll");
	public static final Item TANNED_LEATHER = new ItemBase("tanned_leather");
	public static final Item COW_HIDE = new ItemBase("cow_hide");
	public static final Item MOOSHROOM_HIDE = new ItemBase("mooshroom_hide");
	public static final Item PIG_HIDE = new ItemBase("pig_hide");
	public static final Item COPPER_COIN = new ItemBase("copper_coin");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	public static final Item SILVER_COIN = new ItemBase("silver_coin");
	public static final Item GOLD_COIN = new ItemBase("gold_coin");
	public static final Item HORSE_HIDE = new ItemBase("horse_hide");
	public static final Item HORSE_TAIL = new ItemBase("horse_tail");
	public static final Item SALT = new ItemBase("salt");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	public static final Item MAMMOTH_HIDE = new ItemBase("mammoth_hide");
	// public static final Item MOLTEN_COPPER = new ItemBase("molten_copper");
	// public static final Item WOODEN_BUCKET = new ItemBucket(Blocks.AIR,
	// "wooden_bucket");
	// public static final Item WOODEN_WATER_BUCKET = new
	// ItemBucket(Blocks.FLOWING_WATER, "wooden_water_bucket");
	// public static final Item SUMMON_UNDEAD = new
	// ItemUndeadScroll("undead_scroll");
	// Materials
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial("material_iron", 2, 250, 6.0F, 1.0F, 14);
	public static final ToolMaterial MATERIAL_IRON_2 = EnumHelper.addToolMaterial("material_iron_2", 2, 250, 6.0F, 3.0F, 14);
	public static final ToolMaterial MATERIAL_IRON_3 = EnumHelper.addToolMaterial("material_iron_3", 2, 250, 6.0F, 0.0F, 14);

	// Tools
	public static final ItemSword IRON_SPEAR = new ToolSpear("iron_spear", MATERIAL_IRON);
	public static final ItemSword IRON_HALBERD = new ToolSpear("iron_halberd", MATERIAL_IRON_2);
	public static final ItemSword IRON_DAGGER = new ToolSpear("iron_dagger", MATERIAL_IRON_3);
	public static final ItemSword QUARTERSTAFF = new ToolSpear("quarterstaff", MATERIAL_IRON_3);
	public static final ItemSword STAFF = new ToolSpear("staff", MATERIAL_IRON_3);
	public static final Item STAFF_BURNING_HANDS = new Staff("staff_burning_hands", MATERIAL_IRON_3);
	public static final ItemSword MACE = new ToolSpear("mace", MATERIAL_IRON);
	public static final ItemSword FLAIL = new ToolSpear("flail", MATERIAL_IRON);
	// public static final ItemShield SMALL_SHIELD = new Shield("small_shield");
	
	//Food
	public static final Item MAMMOTH_SHANK = new FoodBase("mammoth_shank", 3, 2F, true);
	public static final Item COOKED_MAMMOTH_SHANK = new FoodBase("cooked_mammoth_shank", 6, 12.8F, true);
	public static final Item BEEF_JERKY = new FoodBase("beef_jerky", 6, 7.0F, true);
	public static final Item RAW_HORSE_MEAT = new FoodBase("raw_horse_meat", 3, 1.8F, true);
	public static final Item COOKED_HORSE_MEAT = new FoodBase("cooked_horse_meat", 6, 12.8F, true);

}
