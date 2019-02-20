package com.superlord.dungeoncraft.world;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;

public class BiomeProviderMultiple extends BiomeProvider {
	
    private final Biome[] biome;


	public BiomeProviderMultiple(Biome... biomeIns)
    {
        this.biome = biomeIns;
    }

    /**
     * Returns the biome generator
     */

    /**
     * Returns an array of biomes for the location input.
     */
    public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height)
    {
        if (biomes == null || biomes.length < width * height)
        {
            biomes = new Biome[width * height];
        }

        Arrays.fill(biomes, 0, width * height, this.biome);
        return biomes;
    }

    /**
     * Gets biomes to use for the blocks and loads the other data like temperature and humidity onto the
     * WorldChunkManager.
     */
    public Biome[] getBiomes(@Nullable Biome[] oldBiomeList, int x, int z, int width, int depth)
    {
        if (oldBiomeList == null || oldBiomeList.length < width * depth)
        {
            oldBiomeList = new Biome[width * depth];
        }

        Arrays.fill(oldBiomeList, 0, width * depth, this.biome);
        return oldBiomeList;
    }

    /**
     * Gets a list of biomes for the specified blocks.
     */
    public Biome[] getBiomes(@Nullable Biome[] listToReuse, int x, int z, int width, int length, boolean cacheFlag)
    {
        return this.getBiomes(listToReuse, x, z, width, length);
    }

    @Nullable
    public BlockPos findBiomePosition(int x, int z, int range, List<Biome> biomes, Random random)
    {
        return biomes.contains(this.biome) ? new BlockPos(x - range + random.nextInt(range * 2 + 1), 0, z - range + random.nextInt(range * 2 + 1)) : null;
    }

    /**
     * checks given Chunk's Biomes against List of allowed ones
     */
    public boolean areBiomesViable(int x, int z, int radius, List<Biome> allowed)
    {
        return allowed.contains(this.biome);
    }

    public boolean isFixedBiome()
    {
        return true;
    }

    
}
