package com.superlord.dungeoncraft.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeSwamp;

public class BiomeMarsh extends Biome {

	public BiomeMarsh() {
		super(new BiomeProperties("Marsh").setBaseBiome("swampland"));
	}
}
