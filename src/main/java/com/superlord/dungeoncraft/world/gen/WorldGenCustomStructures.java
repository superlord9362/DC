package com.superlord.dungeoncraft.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.superlord.dungeoncraft.world.gen.generators.WorldGenStructure;

import net.minecraft.block.Block;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomStructures implements IWorldGenerator {

	private WorldGenStructure ruinedKeep;
	private WorldGenStructure orcHut;
	private WorldGenStructure dwarfForge;
	private WorldGenStructure inn;
	private WorldGenStructure tower;
	private WorldGenStructure grave;
	private WorldGenStructure fort;
	
	public WorldGenCustomStructures() {
		this.ruinedKeep = new WorldGenStructure("ruinedkeep");
		this.orcHut = new WorldGenStructure("orchut");
		this.dwarfForge = new WorldGenStructure("dwarf_forge");
		this.inn = new WorldGenStructure("inn");
		this.tower = new WorldGenStructure("tower");
		this.grave = new WorldGenStructure("grave");
		this.fort = new WorldGenStructure("fort");
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {		
		int blockX = chunkX * 16 + random.nextInt(16);
		int blockZ = chunkZ * 16 + random.nextInt(16);
		
		switch(world.provider.getDimension()) {
		case 0:
			runGenerator(this.ruinedKeep, world, blockX, blockZ, 300, random);
			runGenerator(this.orcHut, world, blockX, blockZ, 100, random);
			runGenerator(this.dwarfForge, world, blockX, blockZ, 200, random);
			runGenerator(this.inn, world, blockX, blockZ, 200, random);
			runGenerator(this.tower, world, blockX, blockZ, 300, random);
			runGenerator(this.grave, world, blockX, blockZ, 200, random);
			runGenerator(this.fort, world, blockX, blockZ, 500, random);
				break;
		case 1:
			break;
		case -1:
			break;
		}
	}
	
	private void runGenerator(WorldGenStructure generator, World world, int blockX, int blockZ, int chance, Random random) {
		if ((int) (Math.random() * chance) == 0) {
			generator.generate(world, random, new BlockPos(blockX, WorldGenStructure.getGroundFromAbove(world, blockX, blockZ), blockZ));
		}
	}

	
	
}
