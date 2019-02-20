package com.superlord.dungeoncraft.init;

import java.util.Optional;

import com.superlord.dungeoncraft.world.biome.BiomeAbyss;
import com.superlord.dungeoncraft.world.biome.BiomeMarsh;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {

	
	public static final Biome MARSH = new BiomeMarsh();
	public static final Biome ABYSS = new BiomeAbyss();
	
	public static void registerBiomes() {
		initBiome(MARSH, "Marsh", BiomeType.COOL, Type.SWAMP, Type.WET);
		initBiome(ABYSS, "Abyss", BiomeType.WARM, Type.SPOOKY, Type.DEAD);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		System.out.println("Biome Added");
		BiomeManager.addSpawnBiome(biome);
		return biome;
	}
	
}
