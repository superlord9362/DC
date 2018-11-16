package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityFriendlySkeleton;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntitySkeleton1;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.entities.models.Skeleton;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class SkeletonRenderer2 extends RenderLiving<EntityFriendlySkeleton> {



	public static final Factory FACTORY = new Factory();

	

	public SkeletonRenderer2(RenderManager manager) {

		super(manager, new Skeleton(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityFriendlySkeleton entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/skeleton.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityFriendlySkeleton> {



        @Override

        public Render<? super EntityFriendlySkeleton> createRenderFor(RenderManager manager) {

            return new SkeletonRenderer2(manager);

        }



    }

}