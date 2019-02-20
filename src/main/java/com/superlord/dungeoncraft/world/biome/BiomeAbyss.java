package com.superlord.dungeoncraft.world.biome;

import com.superlord.dungeoncraft.entities.EntityMane;
import com.superlord.dungeoncraft.entities.EntityUridezu;

import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.world.biome.Biome;

public class BiomeAbyss extends Biome {

	public BiomeAbyss() {
		super(new BiomeProperties("Abyss").setTemperature(0.6F).setRainDisabled());
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityMane.class, 100, 4, 8));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityUridezu.class, 70, 2, 4));

	}

}
