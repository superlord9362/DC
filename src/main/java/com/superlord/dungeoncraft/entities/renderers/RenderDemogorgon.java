package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityDemogorgon;
import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.models.Kobold;
import com.superlord.dungeoncraft.entities.models.Lamia;
import com.superlord.dungeoncraft.entities.models.ModelDemogorgon;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class RenderDemogorgon extends RenderLiving<EntityDemogorgon> {

	public static final Factory FACTORY = new Factory();

	public RenderDemogorgon(RenderManager manager) {
		super(manager, new ModelDemogorgon(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDemogorgon entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/demogorgon.png");
	}
	
	public static class Factory implements IRenderFactory<EntityDemogorgon> {

        @Override
        public Render<? super EntityDemogorgon> createRenderFor(RenderManager manager) {
            return new RenderDemogorgon(manager);
        }
    }
}