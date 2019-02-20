package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityMane;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntityUridezu;
import com.superlord.dungeoncraft.entities.models.ModelMane;
import com.superlord.dungeoncraft.entities.models.ModelUridezu;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class RenderUridezu extends RenderLiving<EntityUridezu> {



	public static final Factory FACTORY = new Factory();

	

	public RenderUridezu(RenderManager manager) {

		super(manager, new ModelUridezu(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityUridezu entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/uridezu.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityUridezu> {



        @Override

        public Render<? super EntityUridezu> createRenderFor(RenderManager manager) {

            return new RenderUridezu(manager);

        }



    }

}