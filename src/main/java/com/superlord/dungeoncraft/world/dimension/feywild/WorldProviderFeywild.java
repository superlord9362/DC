package com.superlord.dungeoncraft.world.dimension.feywild;

import com.superlord.dungeoncraft.init.DimensionInit;
import com.superlord.dungeoncraft.util.DCConfig;
import com.superlord.dungeoncraft.world.dimension.ChunkGeneratorFeywild;
import net.minecraft.init.Biomes;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderFeywild extends WorldProvider {

    public WorldProviderFeywild() {
        this.setDimension(DCConfig.feywildID);
    }

    @Override
    public void init() {
        super.init();
        //TODO: Allow for more than 1 biome
        this.biomeProvider = new BiomeProviderSingle(Biomes.FOREST);
    }

    public DimensionType getDimensionType() {
        return DimensionInit.FEYWILD;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorFeywild(world, world.getSeed());
    }

    //TODO: What other features should be allowed here (eg. Sky Color, Clouds, etc.)?
}
