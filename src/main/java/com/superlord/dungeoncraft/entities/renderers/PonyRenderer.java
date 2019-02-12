package com.superlord.dungeoncraft.entities.renderers;

import java.util.Map;

import com.google.common.collect.Maps;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.EntityPony;
import com.superlord.dungeoncraft.entities.models.Lamia;
import com.superlord.dungeoncraft.entities.models.ModelShetlandPony;
import com.superlord.dungeoncraft.entities.renderers.LamiaRenderer.Factory;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class PonyRenderer extends RenderLiving<EntityPony> {

	public static final Factory FACTORY = new Factory();

	public PonyRenderer(RenderManager manager) {
		super(manager, new ModelShetlandPony(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPony entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/pony.png");
	}
	
	public static class Factory implements IRenderFactory<EntityPony> {

        @Override
        public Render<? super EntityPony> createRenderFor(RenderManager manager) {
            return new PonyRenderer(manager);
        }
    }

}
