package com.superlord.dungeoncraft.entities.renderers;

import com.superlord.dungeoncraft.entities.EntityDeer;
import com.superlord.dungeoncraft.entities.models.ModelDeer;
import com.superlord.dungeoncraft.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDeer extends RenderLiving<EntityDeer> {

	public static final Factory FACTORY = new Factory();

	public RenderDeer(RenderManager manager) {
		super(manager, new ModelDeer(), 0.2F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDeer entity) {
		return new ResourceLocation(Reference.MOD_ID, "textures/entities/deer.png");
	}
	
	public static class Factory implements IRenderFactory<EntityDeer> {

        @Override
        public Render<? super EntityDeer> createRenderFor(RenderManager manager) {
            return new RenderDeer(manager);
        }
    }
}