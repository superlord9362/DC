package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityGnoll;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.Gnoll;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class GnollRenderer extends RenderLiving<EntityGnoll> {



	public static final Factory FACTORY = new Factory();

	

	public GnollRenderer(RenderManager manager) {

		super(manager, new Gnoll(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityGnoll entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/gnoll.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityGnoll> {



        @Override

        public Render<? super EntityGnoll> createRenderFor(RenderManager manager) {

            return new GnollRenderer(manager);

        }



    }

}