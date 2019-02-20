package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntityRothe;
import com.superlord.dungeoncraft.entities.EntitySahuagin;
import com.superlord.dungeoncraft.entities.EntitySkeleton1;
import com.superlord.dungeoncraft.entities.models.ModelRothe;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.entities.models.Sahuagin;
import com.superlord.dungeoncraft.entities.models.Skeleton;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class RotheRenderer extends RenderLiving<EntityRothe> {



	public static final Factory FACTORY = new Factory();

	

	public RotheRenderer(RenderManager manager) {

		super(manager, new ModelRothe(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityRothe entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/rothe.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityRothe> {



        @Override

        public Render<? super EntityRothe> createRenderFor(RenderManager manager) {

            return new RotheRenderer(manager);

        }



    }

}