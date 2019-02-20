package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityBarbedDevil;
import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.models.Kobold;
import com.superlord.dungeoncraft.entities.models.Lamia;
import com.superlord.dungeoncraft.entities.models.ModelBarbedDevil;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class RenderBarbedDevil extends RenderLiving<EntityBarbedDevil> {

	public static final Factory FACTORY = new Factory();

	public RenderBarbedDevil(RenderManager manager) {
		super(manager, new ModelBarbedDevil(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBarbedDevil entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/barbed_devil.png");
	}
	
	public static class Factory implements IRenderFactory<EntityBarbedDevil> {

        @Override
        public Render<? super EntityBarbedDevil> createRenderFor(RenderManager manager) {
            return new RenderBarbedDevil(manager);
        }
    }
}