package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityMane;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntityUridezu;
import com.superlord.dungeoncraft.entities.EntityVampire;
import com.superlord.dungeoncraft.entities.EntityVampireSpawn;
import com.superlord.dungeoncraft.entities.models.ModelMane;
import com.superlord.dungeoncraft.entities.models.ModelUridezu;
import com.superlord.dungeoncraft.entities.models.ModelVampire;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class RenderVSpawn extends RenderLiving<EntityVampireSpawn> {

	public static final Factory FACTORY = new Factory();

	public RenderVSpawn(RenderManager manager) {
		super(manager, new ModelVampire(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityVampireSpawn entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/vampirespawn.png");
	}
	
	public static class Factory implements IRenderFactory<EntityVampireSpawn> {

        @Override
        public Render<? super EntityVampireSpawn> createRenderFor(RenderManager manager) {
            return new RenderVSpawn(manager);
        }
    }
}