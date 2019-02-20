package com.superlord.dungeoncraft.entities.renderers;

import com.superlord.dungeoncraft.entities.EntityTaer;
import com.superlord.dungeoncraft.entities.models.ModelTaer;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTaer extends RenderLiving<EntityTaer> {

	public static final Factory FACTORY = new Factory();

	public RenderTaer(RenderManager manager) {
		super(manager, new ModelTaer(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTaer entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/taer.png");
	}
	
	public static class Factory implements IRenderFactory<EntityTaer> {

        @Override
        public Render<? super EntityTaer> createRenderFor(RenderManager manager) {
            return new RenderTaer(manager);
        }
    }

}
