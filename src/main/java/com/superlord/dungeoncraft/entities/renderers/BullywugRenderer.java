package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityAxeBeak;
import com.superlord.dungeoncraft.entities.EntityBullywug;
import com.superlord.dungeoncraft.entities.EntityCentaur;
import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.AxeBeak;
import com.superlord.dungeoncraft.entities.models.Bullywug;
import com.superlord.dungeoncraft.entities.models.Centaur;
import com.superlord.dungeoncraft.entities.models.Goblin;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class BullywugRenderer extends RenderLiving<EntityBullywug> {



	public static final Factory FACTORY = new Factory();

	

	public BullywugRenderer(RenderManager manager) {

		super(manager, new Bullywug(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityBullywug entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/bullywug.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityBullywug> {



        @Override

        public Render<? super EntityBullywug> createRenderFor(RenderManager manager) {

            return new BullywugRenderer(manager);

        }



    }

}