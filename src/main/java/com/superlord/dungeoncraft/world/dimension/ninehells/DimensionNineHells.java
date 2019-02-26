package com.superlord.dungeoncraft.world.dimension.ninehells;

import com.superlord.dungeoncraft.init.BiomeInit;
import com.superlord.dungeoncraft.init.DimensionInit;
import com.superlord.dungeoncraft.world.BiomeProviderMultiple;
import com.superlord.dungeoncraft.world.dimension.ChunkGeneratorNineHells;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionNineHells extends WorldProvider {

	
	public DimensionNineHells() {
		this.biomeProvider = new BiomeProviderMultiple(BiomeInit.ABYSS, BiomeInit.MARSH);
	}
	
	@Override
	public DimensionType getDimensionType() {
		return DimensionInit.NINEHELLS;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorNineHells(world, false, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

}
