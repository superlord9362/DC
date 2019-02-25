package com.superlord.dungeoncraft.util.handlers;

import com.superlord.dungeoncraft.Main;
import com.superlord.dungeoncraft.entities.EntityAxeBeak;
import com.superlord.dungeoncraft.entities.EntityBarbedDevil;
import com.superlord.dungeoncraft.entities.EntityBullywug;
import com.superlord.dungeoncraft.entities.EntityCentaur;
import com.superlord.dungeoncraft.entities.EntityDeer;
import com.superlord.dungeoncraft.entities.EntityDemogorgon;
import com.superlord.dungeoncraft.entities.EntityDwarf;
import com.superlord.dungeoncraft.entities.EntityFriendlySkeleton;
import com.superlord.dungeoncraft.entities.EntityGnoll;
import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityGuardV;
import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.EntityMammoth;
import com.superlord.dungeoncraft.entities.EntityMane;
import com.superlord.dungeoncraft.entities.EntityOgre;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntityPony;
import com.superlord.dungeoncraft.entities.EntityRothe;
import com.superlord.dungeoncraft.entities.EntitySahuagin;
import com.superlord.dungeoncraft.entities.EntitySkeleton1;
import com.superlord.dungeoncraft.entities.EntityTaer;
import com.superlord.dungeoncraft.entities.EntityUridezu;
import com.superlord.dungeoncraft.entities.EntityVampire;
import com.superlord.dungeoncraft.entities.EntityVampireSpawn;
import com.superlord.dungeoncraft.entities.EntityYuanTi;
import com.superlord.dungeoncraft.entities.EntityYuanTiHalfblood;
import com.superlord.dungeoncraft.init.BiomeInit;
import com.superlord.dungeoncraft.init.ModBlocks;
import com.superlord.dungeoncraft.init.ModItems;
import com.superlord.dungeoncraft.util.IHasModel;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@EventBusSubscriber
public class RegistryHandler {
	


	private static int entityId = 0;

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : ModBlocks.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	@SubscribeEvent

    public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "orc"), EntityOrc.class, "orc", entityId++, Main.instance, 64, 3, true, 12871971, 10507067);
		EntityRegistry.addSpawn(EntityOrc.class, 60, 3, 5, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.ROOFED_FOREST, Biomes.ICE_PLAINS, Biomes.EXTREME_HILLS, Biomes.SWAMPLAND);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "goblin"), EntityGoblin.class, "goblin", entityId++, Main.instance, 64, 3, true, 0x006009, 0x007F46);
		EntityRegistry.addSpawn(EntityGoblin.class, 60, 5, 10, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.ROOFED_FOREST, Biomes.BIRCH_FOREST, Biomes.FOREST_HILLS, Biomes.BIRCH_FOREST_HILLS, Biomes.PLAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "kobold"), EntityKobold.class, "kobold", entityId++, Main.instance, 64, 3, true, 0xAD4500, 0x000000);
		EntityRegistry.addSpawn(EntityKobold.class, 60, 7, 13, EnumCreatureType.CREATURE,  Biomes.ROOFED_FOREST, Biomes.PLAINS, Biomes.ICE_PLAINS, Biomes.BEACH, Biomes.SWAMPLAND, Biomes.DESERT, Biomes.EXTREME_HILLS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "lamia"), EntityLamia.class, "lamia", entityId++, Main.instance, 64, 3, true, 0x7F6A00, 0x000000);
		EntityRegistry.addSpawn(EntityLamia.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.DESERT, Biomes.DESERT_HILLS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "ogre"), EntityOgre.class, "ogre", entityId++, Main.instance, 64, 3, true, 0xE0CDC9, 0x000000);
		EntityRegistry.addSpawn(EntityOgre.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.ICE_PLAINS, Biomes.ICE_MOUNTAINS, Biomes.DESERT, Biomes.PLAINS, Biomes.SWAMPLAND);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "skeleton"), EntitySkeleton1.class, "skeleton", entityId++, Main.instance, 64, 3, true, 0x808080, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "sahuagin"), EntitySahuagin.class, "sahuagin", entityId++, Main.instance, 64, 3, true, 0x267F00, 0x000000);
		EntityRegistry.addSpawn(EntitySahuagin.class, 40, 1, 3, EnumCreatureType.CREATURE, BiomeInit.MARSH, Biomes.BEACH);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "centaur"), EntityCentaur.class, "centaur", entityId++, Main.instance, 64, 3, true, 0x7F6A00, 0x000000);
		EntityRegistry.addSpawn(EntityCentaur.class, 60, 5, 10, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.ROOFED_FOREST, Biomes.BIRCH_FOREST, Biomes.FOREST_HILLS, Biomes.BIRCH_FOREST_HILLS, Biomes.PLAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "skeleton2"), EntityFriendlySkeleton.class, "skeleton2", entityId++, Main.instance, 64, 3, true, 0x808080, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "axebeak"), EntityAxeBeak.class, "axebeak", entityId++, Main.instance, 64, 3, true, 0x262626, 0x000000);
		EntityRegistry.addSpawn(EntityAxeBeak.class, 60, 3, 5, EnumCreatureType.CREATURE, Biomes.PLAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "bullywug"), EntityBullywug.class, "bullywug", entityId++, Main.instance, 64, 3, true, 0xA5A543, 0x000000);
		EntityRegistry.addSpawn(EntityBullywug.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.SWAMPLAND);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "gnoll"), EntityGnoll.class, "gnoll", entityId++, Main.instance, 64, 3, true, 0xA5A543, 0x000000);
		EntityRegistry.addSpawn(EntityGnoll.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.DESERT);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "mammoth"), EntityMammoth.class, "mammoth", entityId++, Main.instance, 64, 3, true, 0x3D0B01, 0x000000);
		EntityRegistry.addSpawn(EntityMammoth.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.ICE_PLAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "dwarf"), EntityDwarf.class, "dwarf", entityId++, Main.instance, 64, 3, true, 0x526168, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "guardv"), EntityGuardV.class, "guardv", entityId++, Main.instance, 64, 3, true, 0x4C3833, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "pony"), EntityPony.class, "pony", entityId++, Main.instance, 64, 3, true, 0x6E3524, 0x000000);
		EntityRegistry.addSpawn(EntityPony.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.PLAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "mane"), EntityMane.class, "mane", entityId++, Main.instance, 64, 3, true, 0x9B8B8B, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "uridezu"), EntityUridezu.class, "uridezu", entityId++, Main.instance, 64, 3, true, 0x3D2B15, 0x000000);
		EntityRegistry.addSpawn(EntityMane.class, 100, 4, 8, EnumCreatureType.CREATURE, BiomeInit.ABYSS);
		EntityRegistry.addSpawn(EntityUridezu.class, 40, 1, 3, EnumCreatureType.CREATURE,  BiomeInit.ABYSS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "taer"), EntityTaer.class, "taer", entityId++, Main.instance, 64, 3, true, 0x6693A1, 0x000000);
		EntityRegistry.addSpawn(EntityTaer.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.ICE_MOUNTAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "vampire"), EntityVampire.class, "vampire", entityId++, Main.instance, 64, 3, true, 0x343A4E, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "vampirespawn"), EntityVampireSpawn.class, "vampirespawn", entityId++, Main.instance, 64, 3, true, 0x343A4E, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "rothe"), EntityRothe.class, "rothe", entityId++, Main.instance, 64, 3, true, 0x4C1E00, 0x000000);
		EntityRegistry.addSpawn(EntityRothe.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.ICE_PLAINS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "demogorgon"), EntityDemogorgon.class, "demogorgon", entityId++, Main.instance, 64, 3, true, 0xD38147, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "barbeddevil"), EntityBarbedDevil.class, "barbeddevil", entityId++, Main.instance, 64, 3, true, 0x4A6800, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "deer"), EntityDeer.class, "deer", entityId++, Main.instance, 64, 3, true, 0x4A6800, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "yuanti"), EntityYuanTi.class, "yuanti", entityId++, Main.instance, 64, 3, true, 0x0094FF, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "yuantihalf"), EntityYuanTiHalfblood.class, "yuantihalf", entityId++, Main.instance, 64, 3, true, 0x0094FF, 0x000000);
}
	
}
