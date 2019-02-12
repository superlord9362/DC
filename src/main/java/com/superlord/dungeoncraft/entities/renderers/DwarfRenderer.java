package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityCentaur;
import com.superlord.dungeoncraft.entities.EntityDwarf;
import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.Centaur;
import com.superlord.dungeoncraft.entities.models.Dwarf;
import com.superlord.dungeoncraft.entities.models.Goblin;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class DwarfRenderer extends RenderLiving<EntityDwarf> {



	public static final Factory FACTORY = new Factory();

	

	public DwarfRenderer(RenderManager manager) {

		super(manager, new Dwarf(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityDwarf entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/dwarf.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityDwarf> {



        @Override

        public Render<? super EntityDwarf> createRenderFor(RenderManager manager) {

            return new DwarfRenderer(manager);

        }



    }

}