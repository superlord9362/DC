package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityCentaur;
import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityOrc;
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



public class CentaurRenderer extends RenderLiving<EntityCentaur> {



	public static final Factory FACTORY = new Factory();

	

	public CentaurRenderer(RenderManager manager) {

		super(manager, new Centaur(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityCentaur entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/centaur.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityCentaur> {



        @Override

        public Render<? super EntityCentaur> createRenderFor(RenderManager manager) {

            return new CentaurRenderer(manager);

        }



    }

}