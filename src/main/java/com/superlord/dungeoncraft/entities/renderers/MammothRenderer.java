package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityMammoth;
import com.superlord.dungeoncraft.entities.models.ModelMammoth;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class MammothRenderer extends RenderLiving<EntityMammoth> {



	public static final Factory FACTORY = new Factory();

	

	public MammothRenderer(RenderManager manager) {

		super(manager, new ModelMammoth(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityMammoth entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/mammoth.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityMammoth> {



        @Override

        public Render<? super EntityMammoth> createRenderFor(RenderManager manager) {

            return new MammothRenderer(manager);

        }



    }

}