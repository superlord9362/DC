package com.superlord.dungeoncraft.blocks;

import java.util.Random;

import com.superlord.dungeoncraft.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SaltOre extends BlockBase {

	public SaltOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
		return ModItems.SALT;
	}
	
}
