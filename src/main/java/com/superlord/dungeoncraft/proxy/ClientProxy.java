package com.superlord.dungeoncraft.proxy;

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
import com.superlord.dungeoncraft.entities.renderers.AxeBeakRenderer;
import com.superlord.dungeoncraft.entities.renderers.BullywugRenderer;
import com.superlord.dungeoncraft.entities.renderers.CentaurRenderer;
import com.superlord.dungeoncraft.entities.renderers.DwarfRenderer;
import com.superlord.dungeoncraft.entities.renderers.GnollRenderer;
import com.superlord.dungeoncraft.entities.renderers.GoblinRenderer;
import com.superlord.dungeoncraft.entities.renderers.GuardVRenderer;
import com.superlord.dungeoncraft.entities.renderers.KoboldRenderer;
import com.superlord.dungeoncraft.entities.renderers.LamiaRenderer;
import com.superlord.dungeoncraft.entities.renderers.MammothRenderer;
import com.superlord.dungeoncraft.entities.renderers.ManeRenderer;
import com.superlord.dungeoncraft.entities.renderers.OgreRenderer;
import com.superlord.dungeoncraft.entities.renderers.OrcRenderer;
import com.superlord.dungeoncraft.entities.renderers.PonyRenderer;
import com.superlord.dungeoncraft.entities.renderers.RenderBarbedDevil;
import com.superlord.dungeoncraft.entities.renderers.RenderDeer;
import com.superlord.dungeoncraft.entities.renderers.RenderDemogorgon;
import com.superlord.dungeoncraft.entities.renderers.RenderTaer;
import com.superlord.dungeoncraft.entities.renderers.RenderUridezu;
import com.superlord.dungeoncraft.entities.renderers.RenderVSpawn;
import com.superlord.dungeoncraft.entities.renderers.RenderVampire;
import com.superlord.dungeoncraft.entities.renderers.RenderYuanTi;
import com.superlord.dungeoncraft.entities.renderers.RenderYuanTiHalfblood;
import com.superlord.dungeoncraft.entities.renderers.RotheRenderer;
import com.superlord.dungeoncraft.entities.renderers.SahuaginRenderer;
import com.superlord.dungeoncraft.entities.renderers.SkeletonRenderer;
import com.superlord.dungeoncraft.entities.renderers.SkeletonRenderer2;
import com.superlord.dungeoncraft.init.BiomeInit;
import com.superlord.dungeoncraft.init.DimensionInit;
import com.superlord.dungeoncraft.init.ModRecipes;
import com.superlord.dungeoncraft.world.ModWorldGen;
import com.superlord.dungeoncraft.world.gen.WorldGenCustomStructures;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}

	
@Override

public void preInit(FMLPreInitializationEvent event) {

	super.preInit(event);

	RenderingRegistry.registerEntityRenderingHandler(EntityOrc.class, OrcRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityGoblin.class, GoblinRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityKobold.class, KoboldRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityLamia.class, LamiaRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityOgre.class, OgreRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntitySkeleton1.class, SkeletonRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntitySahuagin.class, SahuaginRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, CentaurRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityFriendlySkeleton.class, SkeletonRenderer2.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityGnoll.class, GnollRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityAxeBeak.class, AxeBeakRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityBullywug.class, BullywugRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityMammoth.class, MammothRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityDwarf.class, DwarfRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityGuardV.class, GuardVRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityPony.class, PonyRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityMane.class, ManeRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityUridezu.class, RenderUridezu.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityTaer.class, RenderTaer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityVampire.class, RenderVampire.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityVampireSpawn.class,RenderVSpawn.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityRothe.class, RotheRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityDemogorgon.class, RenderDemogorgon.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityBarbedDevil.class, RenderBarbedDevil.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, RenderDeer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityYuanTi.class, RenderYuanTi.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityYuanTiHalfblood.class, RenderYuanTiHalfblood.FACTORY);
	GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
	BiomeInit.registerBiomes();
	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	DimensionInit.registerDimensions();
}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 2);
		ModRecipes.init();

	}

}
