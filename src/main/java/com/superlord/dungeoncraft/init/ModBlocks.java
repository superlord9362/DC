package com.superlord.dungeoncraft.init;

import java.util.ArrayList;
import java.util.List;

import com.superlord.dungeoncraft.blocks.BlockBase;
import com.superlord.dungeoncraft.blocks.CopperOre;
import com.superlord.dungeoncraft.blocks.SaltOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block SILVER_ORE = new CopperOre("silver_ore", Material.ROCK);
	public static final Block SALT_ORE = new SaltOre("salt_ore", Material.ROCK);
	public static final Block RUNE_STONE = new BlockBase("rune_stone", Material.ROCK);
	public static final Block ASH = new BlockBase("ash", Material.GROUND);

}
