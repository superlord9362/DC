package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityMane;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.ModelMane;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class ManeRenderer extends RenderLiving<EntityMane> {



	public static final Factory FACTORY = new Factory();

	

	public ManeRenderer(RenderManager manager) {

		super(manager, new ModelMane(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityMane entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/mane.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityMane> {



        @Override

        public Render<? super EntityMane> createRenderFor(RenderManager manager) {

            return new ManeRenderer(manager);

        }



    }

}