package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityGuardV;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.Goblin;
import com.superlord.dungeoncraft.entities.models.ModelVillager;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class GuardVRenderer extends RenderLiving<EntityGuardV> {



	public static final Factory FACTORY = new Factory();

	

	public GuardVRenderer(RenderManager manager) {

		super(manager, new ModelVillager(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityGuardV entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/guardvillager.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityGuardV> {



        @Override

        public Render<? super EntityGuardV> createRenderFor(RenderManager manager) {

            return new GuardVRenderer(manager);

        }



    }

}